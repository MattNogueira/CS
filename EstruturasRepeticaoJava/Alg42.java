import java.util.Scanner;

public class Alg42 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;
    do {
      System.out.print("Digite um número: ");
      num = teclado.nextInt();
      if (num >= 0 && num <= 25) {
        intervalo1++;
      }
      if (num >= 26 && num <= 50) {
        intervalo2++;
      }
      if (num >= 51 && num <= 75) {
        intervalo3++;
      }
      if (num >= 76 && num <= 100) {
        intervalo4++;
      }
    } while (num >= 0);
    System.out.println("Números no intervalo [0-25]: " + intervalo1);
    System.out.println("Números no intervalo [26-50]: " + intervalo2);
    System.out.println("Números no intervalo [51-75]: " + intervalo3);
    System.out.println("Números no intervalo [76-100]: " + intervalo4);
    teclado.close();
  }
}
