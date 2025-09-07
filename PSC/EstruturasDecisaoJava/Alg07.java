import java.util.Scanner;
public class Alg07 {
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
    if (classificacao == 'A') {
      bonus = salario * 0.2;
    } else if (classificacao == 'B') {
      bonus = salario * 0.15;
    } else if (classificacao == 'C') {
      bonus = salario * 0.1;
    } else {
      bonus = 0;
    }
    System.out.printf("Valor do bônus: R$ %.2f", bonus);
  }
}
