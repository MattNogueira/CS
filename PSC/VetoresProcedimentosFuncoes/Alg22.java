import java.util.Scanner;

public class Alg22 {
  public static void Soma(int a, int b) {
    int soma = a + b;
    System.out.println("A soma é: " + soma);
  }
  
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2;

    System.out.println("Digite o primeiro número: ");
    num1 = teclado.nextInt();
    System.out.println("Digite o segundo número: ");
    num2 = teclado.nextInt();
    Soma(num1, num2);
    teclado.close();
    
  }
}
