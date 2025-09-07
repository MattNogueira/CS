//Importando o Scanner para entrada de dados//
import java.util.Scanner;

public class Alg04 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner input = new Scanner(System.in);
    double nota1, nota2, nota3, media;
    //Entrada de dados//
    System.out.println("Digite a primeira nota: ");
    nota1 = input.nextDouble();
    System.out.println("Digite a segunda nota: ");
    nota2 = input.nextDouble();
    System.out.println("Digite a terceira nota: ");
    nota3 = input.nextDouble();
    //Saída de dados//
    media = (nota1 + nota2 + nota3) / 3;
    if (media >= 7) {
      System.out.println("Aluno Aprovado");
    }
    else {
      System.out.println("Aluno Reprovado");
    };
  }
}
