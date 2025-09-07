import java.util.Scanner;

public class Alg12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o número para gerar a tabuada: ");
    int num = teclado.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " X " + i + " = " + (num * i));
    }
    teclado.close();
  }
}
