import java.util.Scanner;

public class Alg05 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner teclado = new Scanner(System.in);
    int populacaoA, populacaoB, anos = 0;
    double taxaA, taxaB;
    //Entrada de dados//
    System.out.println("Digite a população do país A: ");
    populacaoA = teclado.nextInt();
    System.out.println("Digite a população do país B: ");
    populacaoB = teclado.nextInt();
    System.out.println("Digite a taxa anual de crescimento populacional do país A (n%): ");
    taxaA = Double.parseDouble(teclado.next().replace("%", "").replace(",","."))/100+1;
    System.out.println("Digite a taxa anual de crescimento populacional do país B (n%): ");
    taxaB = Double.parseDouble(teclado.next().replace("%", "").replace(",","."))/100+1;
    //Processamento//
    while (populacaoA < populacaoB) {
      populacaoA = (int) (populacaoA * taxaA);
      populacaoB = (int) (populacaoB * taxaB);
      anos++;
    };
    //Saída de dados//
    System.out.println("Serão necessários " + anos + " anos.");
    teclado.close();
  }
}
