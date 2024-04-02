import java.util.Scanner;

public class Alg21 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double[] entrada = new double[5];
    double[] saida = new double[5];

    for (int i = 0; i < 5; i++) {
      System.out.println("Digite o valor de entrada: ");
      entrada[i] = teclado.nextDouble();
      System.out.println("Digite o valor de saída: ");
      saida[i] = teclado.nextDouble();
    }
    double saldo = 0;
    for (int i = 0; i < 5; i++) {
      saldo += entrada[i] - saida[i];
    }
    System.out.println("Saldo: R$" + saldo);
    teclado.close();
  }
}
