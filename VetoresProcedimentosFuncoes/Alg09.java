import java.util.Scanner;

public class Alg09 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a quantidade de recibos que deseja imprimir: ");
    int qtd = teclado.nextInt();
    int contador = 1;
    while (contador <= qtd) {
      System.out.println("Recibo: " + contador);
      contador++;
    }
    teclado.close();
  }
}
