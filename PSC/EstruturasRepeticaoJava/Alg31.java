import java.util.Scanner;

public class Alg31 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double preco, total = 0, entregue;
    int i = 1;
    do {
      System.out.print("Digite o preço da mercadoria " + i + ": R$ ");
      preco = teclado.nextDouble();
      total += preco;
      i++;
    } while (preco != 0);
    System.out.println("Total da compra: R$ " + total);
    System.out.print("Dinheiro: R$ ");
    entregue = teclado.nextDouble();
    System.out.println("Troco: R$ " + (entregue - total));
    teclado.close();
  }
}
