import java.util.Scanner;

public class Alg15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o número de termos da série de Fibonacci: ");
    int num = teclado.nextInt();
    int a = 1, b = 1, c = 0;
    for (int i = 1; i <= num; i++) {
      System.out.print(a + ", ");
      c = a + b;
      a = b;
      b = c;
    };
    teclado.close();
  }
}
