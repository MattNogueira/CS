public class Alg01 {
  public static void main(String[] args) {
    int[] vetor = new int[10];
    boolean primo = true;

    // Preenche um vetor com dez números inteiros
    for (int i = 0; i <= 9; i++) {
      vetor[i] = (int) (Math.random() * 100);
    }
    // Verifica se o número é primo
    for (int i = 0; i <= 9; i++) {
      primo = true;
      for (int j = 2; j < vetor[i]; j++) {
        if ((vetor[i] % j == 0) && (vetor[i] != 1)) {
          primo = false;
        }
      }
      // Se primo, imprime o número e sua posição
      if (primo) {
        System.out.println("O número " + vetor[i] + " é primo e está na posição " + i);
      }
    }
  }
}
