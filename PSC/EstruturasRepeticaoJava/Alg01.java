//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.//

import java.util.Scanner;

public class Alg01 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner teclado = new Scanner(System.in);
    int nota;
    //Entrada de dados//
    System.out.println("Digite uma nota entre 0 e 10: ");
    nota = teclado.nextInt();
    //Processamento e saída de dados//
    while (nota < 0 || nota > 10) {
      System.out.println("Nota inválida, digite novamente: ");
      nota = teclado.nextInt();
    };
    System.out.println("Nota válida");
    teclado.close();
  }
}
