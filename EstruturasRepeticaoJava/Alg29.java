public class Alg29 {
  public static void main(String[] args) {
    int i;
    double valor;
    System.out.println("Lojas Quase Dois - Tabela de preços:");
    for (i = 1; i <= 50; i++) {
      valor = i * 1.99;
      System.out.printf("%d - R$ %.2f\n", i, valor);
    }
  }
}
