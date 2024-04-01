import java.util.Random;
import java.util.Scanner;

public class Alg06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();
    int[] vetor = new int[30];
    
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = random.nextInt(100) + 1;
    }

    System.out.print("Digite um valor: ");
    int valor = teclado.nextInt();
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == valor) {
        vetor[i] = 0;
        System.out.println("Valor removido do vetor.");
      }
    }
    teclado.close();
  }
}
