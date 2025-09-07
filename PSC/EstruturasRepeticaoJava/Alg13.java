import java.util.Scanner;

public class Alg13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite a base: ");
    int base = teclado.nextInt();
    System.out.print("Digite o expoente: ");
    int expoente = teclado.nextInt();
    int resultado = 1;
    for (int i = 1; i <= expoente; i++) {
      resultado *= base;
    }
    System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    teclado.close();
  }
}
