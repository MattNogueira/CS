import java.util.Scanner;

public class Alg43 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int codigo, quantidade = 0, nomeWidth = 16, precoWidth = 8;
    double preco = 0, total = 0, constante = 0;
    String[] s = new String[6], pedidos = {"Cachorro Quente","Bauru Simples","Bauru com ovo","Hambúrguer","Cheeseburguer","Refrigerante"};

    for (int i = 0; i <= 5; i++) {
      s[i] = String.format("%-" + (nomeWidth) + "sR$ %-" + (precoWidth - 1) + ".2f", pedidos[i], constante);
    }

    do {
      System.out.println("Digite o código do produto (Digite 0 para encerrar):");
      codigo = teclado.nextInt();
      if (codigo != 0) {
      System.out.println("Digite a quantidade de produto: ");
      quantidade = teclado.nextInt();
      }
      switch (codigo) {
        case 100:
          preco = 1.20;
          constante = preco*quantidade;
          s[0] = String.format("%-" + (nomeWidth) + "sR$ %-" + (precoWidth - 1) + ".2f", pedidos[0], constante);
          break;
        case 101:
          preco = 1.30;
          constante = preco*quantidade;
          s[1] = String.format("%-" + (nomeWidth) + "sR$ %-" + (precoWidth - 1) + ".2f", pedidos[1], constante);
          break;
        case 102:
          preco = 1.50;
          constante = preco*quantidade;
          s[2] = String.format("%-" + (nomeWidth) + "sR$ %-" + (precoWidth - 1) + ".2f", pedidos[2], constante);
          break;
        case 103:
          preco = 1.20;
          constante = preco*quantidade;
          s[3] = String.format("%-" + (nomeWidth) + "sR$ %-" + (precoWidth - 1) + ".2f", pedidos[3], constante);
          break;
        case 104:
          preco = 1.30;
          constante = preco*quantidade;
          s[4] = String.format("%-" + (nomeWidth) + "sR$ %-" + (precoWidth - 1) + ".2f", pedidos[4], constante);
          break;
        case 105:
          preco = 1.00;
          constante = preco*quantidade;
          s[5] = String.format("%-" + (nomeWidth) + "sR$ %-" + (precoWidth - 1) + ".2f", pedidos[5], constante);
          break;
      }
      total += constante;
      quantidade = 0;
      constante = 0;
    } while (codigo != 0);
    System.out.println(String.format("%-" + (nomeWidth) + "s%-" + (precoWidth) + "s", "Especificação", "Preço "));
    for (int i = 0; i <= 5; i++) {
    System.out.println(s[i]);
    }
    System.out.printf("Total: R$ %.2f\n", total);
    teclado.close();
  }
}
