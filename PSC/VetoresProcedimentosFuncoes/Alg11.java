import java.util.Scanner;

public class Alg11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double media = 0;
    for (int i = 0; i < 10; i++) {
      System.out.println("Digite a temperatura: ");
      double temperatura = sc.nextDouble();
      media += temperatura;
    }
    media = media / 10;
    System.out.println("A média das temperaturas é: " + media);
    sc.close();
  }
}
