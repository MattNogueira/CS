//Importando o Scanner para entrada de dados//
import java.util.Scanner;

public class Alg5 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner input = new Scanner(System.in);
    int lado1, lado2, lado3;
    //Entrada de dados//
    System.out.println("Digite o primeiro lado: ");
    lado1 = input.nextInt();
    System.out.println("Digite o segundo lado: ");
    lado2 = input.nextInt();
    System.out.println("Digite o terceiro lado: ");
    lado3 = input.nextInt();
    //Saída de dados//
    if (lado1 == lado2 && lado2 == lado3) {
      System.out.println("Triângulo Equilátero");
    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
      System.out.println("Triângulo Isósceles");
    } else {
      System.out.println("Triângulo Escaleno");
    }
  }
}