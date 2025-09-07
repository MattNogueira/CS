import java.util.Scanner;

public class Alg25 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n, idade, soma = 0;
    String turma;
    double media;
    System.out.print("Digite o número de pessoas: ");
    n = teclado.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.print("Digite a idade da " + i + "ª pessoa: ");
      idade = teclado.nextInt();
      soma += idade;
    }
    media = (double) soma / n;
    if (media <= 25) {
      turma = "jovem";;
    } else if (media <= 60) {
      turma = "adulta";
    } else {
      turma = "idosa";
    }
    System.out.println("Em média, a turma é: " + turma + ".");
    teclado.close();
  }
}
