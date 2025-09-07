import java.util.Scanner;

public class Alg17 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o número para calcular o fatorial: ");
    int num = teclado.nextInt();
    long fatorial = 1;
    System.out.print(num + "! = ");
    for (int i = 1; i <= num; i++) {
      fatorial *= i;
      if (i < num) {
        System.out.print(i + ".");
      };
    };
    System.out.println(num + " = " + fatorial);
    teclado.close();
  }
}
