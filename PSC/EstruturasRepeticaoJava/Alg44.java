import java.util.Scanner;

public class Alg44 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String[] nomes = {"José", "Arthur", "Paola", "Hilton", "Voto Nulo", "Voto em Branco"};
    int[] votos = new int[6];
    int voto = 1, total = 0;
    //Apresentação das opções
    System.out.println("Opções");
    for (int i = 0; i <= 5; i++) {
        System.out.println(String.format("%d - %s", i+1, nomes[i], votos[i]));
      }
    //Votação
    while (voto != 0) {
      System.out.println("Digite o número do seu candidato (0 para finalizar): ");
      voto = teclado.nextInt();
      if (voto == 1) {
        votos[0]++;
      }
      if (voto == 2) {
        votos[1]++;
      }
      if (voto == 3) {
        votos[2]++;
      }
      if (voto == 4) {
        votos[3]++;
      }
      if (voto == 5) {
        votos[4]++;
      }
      if (voto == 6) {
        votos[5]++;
      }
      total++;
    }

    //Total de votos
    System.out.printf("%-14s %-5s\n","Opções", "Total");
    for (int i = 0; i <= 5; i++) {
      System.out.println(String.format("%d - %-14s %d", i+1, nomes[i], votos[i]));
    }
    if (total != 0) {
        System.out.printf("%d porcento dos votos são nulos.\n", (votos[4]/total)*100);
        System.out.printf("%d porcento dos votos são brancos.\n", (votos[5]/total)*100);
    } else {
        System.out.println("Nenhum voto realizado.");
    }
    teclado.close();
    }
}
