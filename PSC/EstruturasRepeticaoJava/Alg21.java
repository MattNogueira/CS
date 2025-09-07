import java.util.Scanner;

public class Alg21 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int num = teclado.nextInt();
    boolean primo = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        primo = false;
        break;
      }
    }
    if (primo) {
      System.out.println(num + " é um número primo.");
    } else {
      System.out.println(num + " não é um número primo.");
    }
    teclado.close();
  }
}
