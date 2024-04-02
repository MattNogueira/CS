import java.util.Scanner;

public class Alg16 {
  public static void main(String[] args) {
    int[] respostas = new int[5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < respostas.length; i++) {
      System.out.print("Digite a resposta " + (i + 1) + ": ");
      respostas[i] = scanner.nextInt();
    }
    for (int i = respostas.length - 1; i >= 0; i--) {
      System.out.println("Resposta " + (i + 1) + ": " + respostas[i]);
    }
    scanner.close();
  }
}
