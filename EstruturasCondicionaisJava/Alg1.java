//Importando o Scanner para entrada de dados//
import java.util.Scanner;
public class Alg1 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner input = new Scanner(System.in);
    int num1, num2;
    //Entrada de dados//
    System.out.println("Digite o primeiro número: ");
    num1 = input.nextInt();
    System.out.println("Digite o segundo número: ");
    num2 = input.nextInt();
    //Saída de dados//
    if (num1 > num2) {
      System.out.println("O maior número é: " + num1);
    }
    else {
      System.out.println("O maior número é: " + num2);
    };
  }
}