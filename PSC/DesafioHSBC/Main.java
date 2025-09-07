import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Declaração de variáveis
    Scanner teclado = new Scanner(System.in);
    int[] dinheiroPessoas = new int[10];
    int dinheiroConfessado, dinheiroRoubado = 0;

    //Criação do vetor das pessoas presas
    for (i = 0; i < 10; i++) {
      System.out.println("Digite o dinheiro que a pessoa " + (i+1) + " tinha:");
      int valor = teclado.nextInt();
      dinheiroPessoas[i] = valor;
    }
    //Valor do dinheiro confessado
    System.out.println("Digite o valor do dinheiro confessado: ");
    dinheiroConfessado = teclado.nextInt();
    //Comparação
    for (i = 0; i < 10; i++) {
      if ((dinheiroConfessado <= dinheiroPessoas[i]) && (dinheiroConfessado % 10 == 0)) {
        dinheiroRoubado += dinheiroConfessado;
      }
    }
    System.out.println("O valor total de dinheiro roubado foi de: R$" + dinheiroRoubado + ",00");
  }
}
