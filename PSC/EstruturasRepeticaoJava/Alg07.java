import java.util.Scanner;
public class Alg07 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int maior = 0;
    for (int i = 1; i <= 5; i++) {
      System.out.print("Digite o " + i + "º número: ");
      int num = teclado.nextInt();
      if (num > maior) {
        maior = num;
      }
    }
    System.out.println("O maior número é: " + maior);
    teclado.close();
  }
}
