import java.util.Scanner;

public class Alg46 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome;
    String[] ordem = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
    double[] saltos = new double[5];
    double media = 0, melhorSalto = 0, piorSalto = 100;
    int i = 0;

    do {
      System.out.print("Digite o nome do atleta: ");
      nome = teclado.nextLine();
      if (nome.equals("")) {
        break;
      }
      for (i = 0; i <= 4; i++) {
        System.out.print("Digite a distância do " + (i+1) + "º salto: ");
        saltos[i] = teclado.nextDouble();
        if (saltos[i] > melhorSalto) {
          melhorSalto = saltos[i];
        }
        if (saltos[i] < piorSalto) {
          piorSalto = saltos[i];
        }
      }
      for (i = 0; i <= 4; i++) {
        if (saltos[i] == melhorSalto || saltos[i] == piorSalto) {
          continue;
        }
        media += saltos[i];
      }
      media = media/3;
      System.out.println("Atleta: " + nome + "\n");
      for (i = 0; i <= 4; i++) {
        System.out.println(ordem[i] + " salto: " + saltos[i] + "m");
      }
      System.out.println("\nMelhor Salto: " + melhorSalto + "m");
      System.out.println("Pior Salto: " + piorSalto + "m");
      System.out.printf("Média dos saltos: %.2fm\n", media);
      System.out.println("\nResultado final: ");
      System.out.printf("%s: %.2fm\n", nome,  media);
    } while (!nome.equals(""));
    teclado.close();
  }
}
