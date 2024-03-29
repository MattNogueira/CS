import java.util.Scanner;

public class Alg49 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num;
    double soma = 0, a = 1, b = 1;

    System.out.print("Digite o número alvo da sequência: ");
    num = teclado.nextInt();
    System.out.printf("S = %d/%d", (int) a, (int) b);
    for (a = 1; a <= num; a++) {
      if (a != 1) {
        b += 2;
        System.out.printf(" + %d/%d", (int) a, (int) b);
      }
      soma += (a/b);
    }
    System.out.printf(" = %.2f", soma);
    teclado.close();
  }
}
