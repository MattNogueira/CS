import java.util.Scanner;

public class Alg11{
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int soma = 0;
      System.out.print("Digite o primeiro número: ");
      int num1 = teclado.nextInt();
      System.out.print("Digite o segundo número: ");
      int num2 = teclado.nextInt();
      if (num1 < num2) {
        for (int i = num1; i <= num2; i++) {
          System.out.println(i);
          soma += i;
        }
      } else {
        for (int i = num2; i <= num1; i++) {
          System.out.println(i);
          soma += i;
        }
      }
      System.out.println("A soma dos números é: " + soma);
      teclado.close();
    }
  }
