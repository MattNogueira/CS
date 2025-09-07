import java.util.Scanner;

public class Alg45 {
  public static void main(String[] args) {
    //Declaração de variáveis
    Scanner teclado = new Scanner(System.in);
    String resposta;
    String[] gabarito = new String[10];
    int acertos = 0, maiorAcerto = 0, menorAcerto = 10, totalAlunos = 0, mediaNota = 0;
    //Professor preenche gabarito
    for (int i = 0; i <= 9; i++) {
      System.out.print("Digite a resposta da questão " + (i+1) + ": ");
      gabarito[i] = teclado.nextLine().toUpperCase();
      if (gabarito[i].equals("A") || gabarito[i].equals("B") || gabarito[i].equals("C") || gabarito[i].equals("D") || gabarito[i].equals("E")) {
        continue;
      } else {
        System.out.println("Resposta inválida, digite novamente.");
        i--;
      }
    }
    //Aluno responde
    do {
      for (int i = 0; i <= 9; i++) {
        System.out.print("Digite sua resposta da questão " + (i+1) + ": ");
        resposta = teclado.nextLine().toUpperCase();
        if (resposta.equals("A") ||resposta.equals("B") || resposta.equals("C") || resposta.equals("D") || resposta.equals("E")) {
          if (resposta.equals(gabarito[i])) {
            acertos++;
          }
        } else {
          System.out.println("Resposta inválida, digite novamente.");
          i--;
        }
      }
      if (acertos >= maiorAcerto) {
        maiorAcerto = acertos;
      }
      if (acertos <= menorAcerto) {
        menorAcerto = acertos;
      }
      totalAlunos++;
      mediaNota += acertos;
      acertos = 0;
      System.out.println("Há mais alunos? (S/N)");
      resposta = teclado.nextLine().toUpperCase();
    } while (resposta.equals("S"));
    System.out.println("Maior nota: " + maiorAcerto);
    System.out.println("Menor nota: " + menorAcerto);
    System.out.println("Média da turma: " + (mediaNota/totalAlunos));
    teclado.close();
  }
}
