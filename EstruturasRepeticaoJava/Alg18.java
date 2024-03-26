import java.util.Scanner;

public class Alg18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o número de elementos do conjunto: ");
    int n = teclado.nextInt();
    int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, soma = 0;
    for (int i = 1; i <= n; i++) {
      System.out.print("Digite o " + i + "º número: ");
      int num = teclado.nextInt();
      if (num < menor) {
        menor = num;
      }
      if (num > maior) {
        maior = num;
      }
      soma += num;
    }
    System.out.println("O menor valor é: " + menor);
    System.out.println("O maior valor é: " + maior);
    System.out.println("A soma dos valores é: " + soma);
    teclado.close();
  }
}
