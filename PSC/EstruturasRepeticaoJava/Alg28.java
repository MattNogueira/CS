import java.util.Scanner;

public class Alg28 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n, i;
    double valor, soma = 0, media;
    System.out.print("Digite a quantidade de CDs: ");
    n = teclado.nextInt();
    for (i = 1; i <= n; i++) {
      System.out.print("Digite o valor do " + i + "º CD: ");
      valor = teclado.nextDouble();
      soma += valor;
    }
    media = soma / n;
    System.out.println("O valor total investido pelos CDs é: R$ " + soma + ".");
    System.out.println("O valor médio gasto em cada CD é: R$ " + media + ".");
    teclado.close();''
  }
}
