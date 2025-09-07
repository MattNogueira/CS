import java.util.Scanner;

public class Alg28 { 
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double taxaComissao = 0.05, salario = 545.00, valorMaisVendido = 0, total = 0;
    int maisVendido = 0, posicao = 0;
    double[] preco = new double[10];
    int[] quantidade = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.println("Digite o valor do " + (i + 1) + "° produto: ");
      preco[i] = teclado.nextDouble();
      System.out.println("Digite a quantidade vendida do " + (i + 1) + "° produto: ");
      quantidade[i] = teclado.nextInt();
    }
    System.out.println("Quantidade\tPreço\t\tValor Total");
    for (int i = 0; i < 10; i++) {
      System.out.println(quantidade[i] + "\t\tR$" + preco[i] + "\t\tR$" + (quantidade[i] * preco[i]));
      if (quantidade[i] > maisVendido) {
        maisVendido = quantidade[i];
        valorMaisVendido = preco[i];
        posicao = i;
      }
      total += quantidade[i] * preco[i];
    }
    System.out.println("O total vendido foi de R$" + total);
    System.out.println("A comissão do vendedor foi de R$" + (total * taxaComissao));
    System.out.println("O salário final do vendedor foi de R$" + (salario + total*taxaComissao));
    System.out.println("O produto mais vendido foi o " + (posicao + 1) + "° produto, com R$" + valorMaisVendido + " de preço.");
    teclado.close();
  }
}
