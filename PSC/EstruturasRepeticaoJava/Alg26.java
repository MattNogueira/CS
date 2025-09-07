import java.util.Scanner;

public class Alg26 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int n, voto, candidato1 = 0, candidato2 = 0, candidato3 = 0;
      System.out.print("Digite o número total de eleitores: ");
      n = teclado.nextInt();
      for (int i = 1; i <= n; i++) {
        System.out.println("Eleitor " + i + ", digite o número do candidato que você deseja votar (1, 2 ou 3): ");
        voto = teclado.nextInt();
        if (voto == 1) {
          candidato1++;
        } else if (voto == 2) {
          candidato2++;
        } else if (voto == 3) {
          candidato3++;
        }
      }
      System.out.println("O candidato 1 recebeu " + candidato1 + " votos.");
      System.out.println("O candidato 2 recebeu " + candidato2 + " votos.");
      System.out.println("O candidato 3 recebeu " + candidato3 + " votos.");
      teclado.close();
    }
}
