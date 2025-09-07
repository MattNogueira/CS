import java.util.Scanner;

public class Alg47 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome;
    double[] notas = new double[7];
    double media = 0, melhorNota = 0, piorNota = 10;
    int i = 0;

    //Informando o nome
    System.out.print("Digite o nome do atleta: ");
    nome = teclado.nextLine();
    //Subindo notas
    for (i = 0; i <= 6; i++) {
      System.out.printf("Digite a %d° nota: ", i+1);
      notas[i] = teclado.nextDouble();
      if (notas[i] > melhorNota) {
        melhorNota = notas[i];
      }
      if (notas[i] < piorNota) {
        piorNota = notas[i];
      }
    }
    //Calculando a media
    for (i = 0; i <= 6; i++) {
      if (notas[i] == melhorNota || notas[i] == piorNota) {
        continue;
      }
      media += notas[i];
    }
    media = media/5;
    //Imprimindo dados
    System.out.println("\nAtleta: " + nome);
    for (i = 0; i <= 6; i++) {
      System.out.println("Nota: " + notas[i]);
    }
    System.out.println("\nResultado final: ");
    System.out.println("Atleta: " + nome);
    System.out.println("Melhor nota: " + melhorNota);
    System.out.println("Pior nota: " + piorNota);
    System.out.printf("Média: %.2fm\n", media);
    teclado.close();
  }
}
