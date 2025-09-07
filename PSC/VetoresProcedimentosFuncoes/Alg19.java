import java.util.Scanner;

public class Alg19 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] codigos = {1, 2, 3, 4, 5};
    int codigoDigitado;
    boolean codigoEncontrado = false;

    System.out.println("Digite o código do produto:");
    codigoDigitado = teclado.nextInt();
    for (int i = 0; i < codigos.length; i++) {
      if (codigoDigitado == codigos[i]) {
        codigoEncontrado = true;
        break;
      }
    }
    if (codigoEncontrado) {
      System.out.println("O código está presente no vetor.");
    } else {
      System.out.println("O código não está presente no vetor.");
    }
    teclado.close();
  }
}
