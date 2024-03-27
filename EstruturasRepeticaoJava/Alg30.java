import java.util.Scanner;

public class Alg30 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double preco, valor;
    System.out.print("Digite o preço do pão: R$ ");
    preco = teclado.nextDouble();
    System.out.println("Panificadora Pão de Ontem - Tabela de preços:");
    for (int i = 1; i <= 50; i++) {
      valor = i * preco;
      System.out.printf("%d - R$ %.2f\n", i, valor);
    }
    teclado.close();
  }
}
