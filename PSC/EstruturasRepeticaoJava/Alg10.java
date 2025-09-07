import java.util.Scanner;

public class Alg10{
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.print("Digite o primeiro número: ");
      int num1 = teclado.nextInt();
      System.out.print("Digite o segundo número: ");
      int num2 = teclado.nextInt();
      if (num1 < num2) {
        for (int i = num1; i <= num2; i++) {
          System.out.println(i);
        }
      } else {
        for (int i = num2; i <= num1; i++) {
          System.out.println(i);
        }
      }
      teclado.close();
    }
  }
