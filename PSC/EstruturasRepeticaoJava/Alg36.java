import java.util.Scanner;

public class Alg36 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num, inicio, fim;
    System.out.print("Digite o número para a tabuada: ");
    num = teclado.nextInt();
    System.out.print("Digite o fator inicial da tabuada: ");
    inicio = teclado.nextInt();
    System.out.print("Digite o fator final da tabuada: ");
    fim = teclado.nextInt();
    System.out.println("Vou montar a tabuada de " + num + " começando em " + inicio + " e terminando em " + fim + ":");
    for (int i = inicio; i <= fim; i++) {
    System.out.printf(" %d x %d = %d\n", num, i, num * i);
    }
    teclado.close();
  }
}
