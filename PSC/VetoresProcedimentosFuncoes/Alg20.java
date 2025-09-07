public class Alg20 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double[] precos = new double[10];
    double foco = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o preço do produto " + (i + 1) + ": ");
      precos[i] = teclado.nextDouble();
    }
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (precos[i] > precos[j]) {
          foco = precos[i];
          precos[i] = precos[j];
          precos[j] = foco;
        }
      }
    }
    for (int i = 9; i >= 0; i--) {
        System.out.println(precos[i]);
    }
    teclado.close();
  }
}
