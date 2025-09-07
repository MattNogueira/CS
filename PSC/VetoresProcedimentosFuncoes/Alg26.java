import java.util.Scanner;

public class Alg26 {
  public static void mediaNotas(int[] conjunto) {
    double media = 0;
    for (int i = 0; i < conjunto.length; i++) {
      media += conjunto[i];
    }
    media /= conjunto.length;
    System.out.println(media);
  }
  
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o tamanho do conjunto: ");
    int tamanho = teclado.nextInt();
    int[] conjunto = new int[tamanho];
    for (int i = 0; i < tamanho; i++) {
      System.out.println("Digite o valor do conjunto: ");
      conjunto[i] = teclado.nextInt();
    }
    mediaNotas(conjunto);
    teclado.close();
  }
}
