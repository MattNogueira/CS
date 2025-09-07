import java.util.Scanner;

public class Alg50 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num;
    double i, h = 0;

    num = teclado.nextInt();
    for (i = 1; i <= num; i++) {
      h += 1.0/i;
    }
    System.out.printf("%.2f", h);
    teclado.close();
  }
}
