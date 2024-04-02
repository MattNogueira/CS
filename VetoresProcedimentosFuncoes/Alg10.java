import java.util.Scanner;

public class Alg10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a tabuada desejada: ");
    int numero = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
  }
}
