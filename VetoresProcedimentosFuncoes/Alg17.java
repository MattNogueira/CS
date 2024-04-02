import java.util.Scanner;

public class Alg17 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double nota, media = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
      nota = teclado.nextDouble();
      media += nota;
    }
    media /= 10;
    System.out.println("A média das notas dos alunos é: " + media);
    teclado.close();
  }
}
