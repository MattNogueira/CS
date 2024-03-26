import java.util.Scanner;

public class Alg8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int soma = 0;
    for (int i = 1; i <= 5; i++) {
      System.out.print("Digite o " + i + "º número: ");
      int num = teclado.nextInt();
      soma += num;
    };
    double media = (double) soma / 5;
    System.out.println("A soma dos números é: " + soma);
    System.out.println("A média dos números é: " + media);
    teclado.close();
  }
}
