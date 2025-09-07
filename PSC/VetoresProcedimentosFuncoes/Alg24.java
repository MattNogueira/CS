import java.util.Scanner;

public class Alg24 {
  public static boolean parImpar(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int num = teclado.nextInt();
    boolean resultado = parImpar(num);
    if (resultado) {
        System.out.println("Par.");
    } else {
        System.out.println("Ímpar.");
    }
    teclado.close();
  }
}
