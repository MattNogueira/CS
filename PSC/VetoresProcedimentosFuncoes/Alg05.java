import java.util.Random;

public class Alg05 {
  public static void main(String[] args) {
    int[] vetor = new int[15];
    Random random = new Random();

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = random.nextInt(50) + 1;
    }

    boolean encontrou = false;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == 20) {
        System.out.println("O número 20 foi encontrado na posição " + i + ".");
        encontrou = true;
        break;
      } 
    }

    if (!encontrou) {
      System.out.println("O número 20 não foi encontrado no vetor.");
    }
  }
}
