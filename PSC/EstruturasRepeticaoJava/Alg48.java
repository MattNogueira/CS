import java.util.Scanner;

public class Alg48 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num, invertido = 0, resto;
    num = teclado.nextInt();
    while (num != 0) {
      resto = num % 10;
      invertido = invertido * 10 + resto;
      num /= 10;
    }
    System.out.println(invertido);
    teclado.close();
  }
}
