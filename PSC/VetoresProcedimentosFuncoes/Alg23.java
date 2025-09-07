
import java.util.Scanner;

public class Alg23 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String[] modelos = {"Fusca", "Gol", "Vectra", "Uno", "Palio"};
    double[] kms = {10.7, 12.8, 15.2, 9.8, 13.2};
    double menor = 100;
    String menorNome = "";

    for (int i = 0; i < modelos.length; i++) {
      if (kms[i] < menor) {
        menor = kms[i];
        menorNome = modelos[i];
      }
    }

    System.out.println("O modelo mais econômico é o " + menorNome);
    for (int i = 0; i < modelos.length; i++) {
      System.out.printf("%s - %.2fL em 1000km\n", modelos[i], 1000/kms[i]);
    }
    teclado.close();
  }
}
