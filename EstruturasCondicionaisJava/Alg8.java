import java.util.Scanner;

public class Alg8 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner input = new Scanner(System.in);
    double salario, bonus;
    char classificacao;
    //Entrada de dados//
    System.out.println("Digite o salário atual: ");
    salario = input.nextDouble();
    System.out.println("Digite a classificação: ");
    classificacao = input.next().charAt(0);
    //Saída de dados//
    switch (classificacao) {
      case 'A':
        bonus = salario * 0.2;
        break;
      case 'B':
        bonus = salario * 0.15;
        break;
      case 'C':
        bonus = salario * 0.1;
        break;
      case 'D':
        bonus = salario * 0.05;
        break;
      case 'E':
        bonus = salario * 0.02;
        break;
      default:
        bonus = 0;
        break;
    };
    System.out.printf("Valor do bônus: R$ %.2f", bonus);
  }
}