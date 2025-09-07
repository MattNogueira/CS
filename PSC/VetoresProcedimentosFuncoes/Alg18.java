import java.util.Scanner;

public class Alg18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double maior = 0, temperatura;

    for (int i = 0; i < 8; i++) {
      System.out.println("Digite a temperatura: ");
      temperatura = teclado.nextDouble();
      if (temperatura > maior) {
        maior = temperatura;
      }
    }
    System.out.println("A maior temperatura é: " + maior);
    teclado.close();
  }
}
