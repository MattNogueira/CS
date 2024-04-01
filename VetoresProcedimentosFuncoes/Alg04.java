import java.util.Random;

public class Alg04 {
  public static void main(String[] args) {
    int[] vetor = new int[20];
    Random random = new Random();

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = random.nextInt(30) + 1;
    }

    boolean encontrou = false;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == 25) {
        encontrou = true;
        break;
      }
    }

    if (encontrou) {
      System.out.println("O número 25 foi encontrado no vetor.");
    } else {
      System.out.println("O número 25 não foi encontrado no vetor.");
    }
  }
}
