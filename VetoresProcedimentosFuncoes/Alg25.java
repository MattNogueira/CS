import java.util.Scanner;

public class Alg25 {
  public static void calculaPerimetro(int raio) {
    double perimetro = 2 * 3.14 * raio;
    System.out.printf("O perímetro do círculo é: %.2f\n", perimetro);
  }
  
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite o raio: ");
    int raio = teclado.nextInt();
    calculaPerimetro(raio);
    teclado.close();
  }
}
