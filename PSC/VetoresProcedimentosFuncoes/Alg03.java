import java.util.Random;

public class Alg03 {
  public static void main(String[] args) {
    Random random = new Random();
    int[] vetor = new int[10];
    int soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = random.nextInt(100);
      soma += vetor[i];
    }
    double media = (double) soma / 10;
    System.out.println("A média dos elementos do vetor é: " + media);
  }
}
