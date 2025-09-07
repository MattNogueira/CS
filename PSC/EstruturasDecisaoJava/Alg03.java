//Importando o Scanner para entrada de dados//
import java.util.Scanner;

public class Alg03 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner input = new Scanner(System.in);
    String produto;
    double preco1, preco2;
    //Entrada de dados//
    System.out.println("Digite o nome do produto: ");
    produto = input.nextLine();
    System.out.println("Digite o preço do produto no primeiro estabelecimento: ");
    preco1 = input.nextDouble();
    System.out.println("Digite o preço do produto no segundo estabelecimento: ");
    preco2 = input.nextDouble();
    //Saída de dados//
    if (preco1 < preco2) {
      System.out.println("O produto " + produto + " está mais barato no primeiro estabelecimento.");
    } else {
      System.out.println("O produto " + produto + " está mais barato no segundo estabelecimento.");
    }
  }
}
