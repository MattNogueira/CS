import java.util.Scanner;

public class Alg11 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner input = new Scanner(System.in);
    String tipoAssento, maisEspaco, precoAssento = "";
    Boolean erro = false;
    //Entrada de dados//
    System.out.println("Digite o tipo de assento: ");
    tipoAssento = input.nextLine().toLowerCase();
    System.out.println("Espaço para as pernas: ");
    maisEspaco = input.nextLine().toLowerCase().replaceAll("espa[^\\p{ASCII}]o extra", "Espaço Extra");
    maisEspaco = maisEspaco.replace("normal", "Normal");
    tipoAssento = tipoAssento.replace("janela", "Janela");
    tipoAssento = tipoAssento.replace("corredor", "Corredor");
    tipoAssento = tipoAssento.replace("meio", "Meio");
    //Saída de dados//
    if (tipoAssento.equals("Janela")) {
      if (maisEspaco.equals("Normal")) {
        precoAssento = "R$ 300,00";
      } else if (maisEspaco.equals("Espaço Extra")) {
        precoAssento = "R$ 350,00";
      } else {
        erro = true;
      };
    } else if (tipoAssento.equals("Corredor")) {
      if (maisEspaco.equals("Normal")) {
        precoAssento = "R$ 280,00";
      } else if (maisEspaco.equals("Espaço Extra")) {
        precoAssento = "R$ 330,00";
      } else {
        erro = true;
      };
    } else if (tipoAssento.equals("Meio")) {
      if (maisEspaco.equals("Normal")) {
        precoAssento = "R$ 250,00";
      } else if (maisEspaco.equals("Espaço Extra")) {
        precoAssento = "R$ 300,00";
      } else {
        erro = true;
      };
    };
    if (erro == false) {
      System.out.printf("Assento escolhido: %s - %s - Custo %s\n", tipoAssento, maisEspaco, precoAssento);
    } else {
      System.out.println("Tipo de assento indisponível.");
    };
  }
}