import java.util.Random;

public class Alg08 {
  public static void main(String[] args) {
    int[] vetorA = new int[15];
    int[] vetorB = new int[15];
    Random random = new Random();

    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = random.nextInt(100);
      System.out.println("Vetor A: " + vetorA[i]);
    }
    for (int i = 0; i < vetorA.length; i++) {
      vetorB[i] = vetorA[vetorA.length - 1 - i];
      System.out.println("Vetor B: " + vetorB[i]);
    }
  }
}
