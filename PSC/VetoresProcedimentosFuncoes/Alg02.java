public class Alg02 {
  public static void main(String[] args) {
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] vetor3 = new int[20];

    for (int x = 0; x < 10; x++) {
      vetor1[x] = (int) (Math.random() * 100);
    }
    for (int y = 0; y < 10; y++) {
      vetor2[y] = (int) (Math.random() * 100);
    }

    for (int x = 0; x < 20; x++) {
      if (x % 2 == 0) {
        vetor3[x] = vetor1[x / 2];
      } else {
        vetor3[x] = vetor2[x / 2];
      }
      System.out.print(vetor3[x] + " ");
    }
    System.out.print("\n");
  }
}
