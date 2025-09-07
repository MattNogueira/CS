import java.util.Scanner;

public class Alg38 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double salario, taxa = 1.015;
    System.out.print("Digite o salário inicial do funcionário: ");
    salario = teclado.nextDouble();
    //Aumento de 1,5% anual em 1996//
    salario *= taxa;
    //Aumento regular após 1996. Fiquei em dúvida. Se o aumento da taxa estiver dentro fo 'for', o salário fica estratosférico.//
    taxa = (taxa-1)*2+1;
    for (int i = 1997; i <= 2024; i++) {
      salario = salario * taxa;
    }
    System.out.printf("O salário atual do funcionário é R$ %.2f.", salario);
    teclado.close();
  }
}
