import java.util.Scanner;

public class Alg39 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num, numMaior = 0, numMenor = 0, altura, alturaMaior = 0, alturaMenor = 0;
    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite o número do " + i + "º aluno: ");
      num = teclado.nextInt();
      System.out.print("Digite a altura do " + i + "º aluno em centímetros: ");
      altura = teclado.nextInt();
      if (i == 1) {
        numMaior = num;
        numMenor = num;
        alturaMaior = altura;
        alturaMenor = altura;
      } else {
        if (altura > alturaMaior || alturaMaior == 0) {
          alturaMaior = altura;
          numMaior = num;
        }
        if (altura < alturaMenor || alturaMenor == 0) {
          alturaMenor = altura;
          numMenor = num;
        }
      }
    }
    System.out.println("O aluno mais alto é o de número " + numMaior + " e sua altura é " + alturaMaior + "cm.");
    System.out.println("O aluno mais baixo é o de número " + numMenor + " e sua altura é " + alturaMenor + "cm.");
    teclado.close();
  }
}
