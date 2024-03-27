//Importando o Scanner para entrada de dados//
import java.util.Scanner;

public class Alg02 {
  public static void main(String[] args) {
    // Variável de variáveis//
    Scanner input = new Scanner(System.in);
    int num1, num2, num3;
    // Entrada de dados//
    System.out.println("Digite o primeiro número: ");
    num1 = input.nextInt();
    System.out.println("Digite o segundo número: ");
    num2 = input.nextInt();
    System.out.println("Digite o terceiro número: ");
    num3 = input.nextInt();
    // Saída de dados//
    if (num1 > num2 && num1 > num3) {
      System.out.println("O maior número é: " + num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("O maior número é: " + num2);
    } else {
      System.out.println("O maior número é: " + num3);
    };
  }
}
