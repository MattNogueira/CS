import java.util.Scanner;

public class Alg27 { 
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] array = new int[10];
    boolean[] modificado = new boolean[10];
    int i;
    int resposta = 0;

    for (i = 0; i < 10; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      array[i] = teclado.nextInt();
      modificado[i] = false;
    }
    while (resposta == 0) {
      System.out.print("Digite o índice do elemento que deseja modificar: ");
      i = teclado.nextInt();
      if (modificado[i] == false) {
        System.out.print("Digite o novo valor: ");
        array[i] = teclado.nextInt();
        modificado[i] = true;
      } else {
        System.out.println("O elemento já foi modificado.");
      }
      System.out.print("Deseja modificar outro elemento? (0/1) ");
      resposta = teclado.nextInt();
    }
    teclado.close();
  }
}
