import java.util.Random;

public class Alg07 {
  public static void main(String[] args) {
    Random random = new Random();
    double[] vetor = new double[5];

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = random.nextDouble();
    }

    double maior = vetor[0];
    double menor = vetor[0];

    for (int i = 1; i < vetor.length; i++) {
      if (vetor[i] > maior) {
        maior = vetor[i];
      }
      if (vetor[i] < menor) {
        menor = vetor[i];
      }
    }

    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);
  }
}
