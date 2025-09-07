import java.util.Scanner;

public class Alg24 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double soma = 0;
    System.out.print("Digite o número de notas: ");
    int n = teclado.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.print("Digite a " + i + "ª nota: ");
      soma += teclado.nextDouble();
    }
    System.out.println("A média das notas é: " + (soma / n));
    teclado.close();
  }
}
