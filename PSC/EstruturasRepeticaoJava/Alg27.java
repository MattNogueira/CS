import java.util.Scanner;

public class Alg27 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int turmas, alunos, soma = 0;
    double media;
    System.out.print("Digite o número de turmas: ");
    turmas = teclado.nextInt();
    for (int i = 1; i <= turmas; i++) {
      do {
        System.out.print("Digite o número de alunos da " + i + "ª turma: ");
        alunos = teclado.nextInt();
        if (alunos > 40) {
            System.out.println("O número máximo de alunos é 40.");
        };
      } while (alunos > 40);
      soma += alunos;
    }
    media = (double) soma / turmas;
    System.out.println("A média de alunos por turma é: " + media + ".");
    teclado.close();
  }
}
