import java.util.Scanner;

public class Alg33 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double temperatura, menor, maior, media = 0;
    int i = 2;
    System.out.print("Digite a 1ª temperatura: ");
    temperatura = teclado.nextDouble();
    menor = temperatura;
    maior = temperatura;
    media += temperatura;
    while (temperatura != -1) {
      System.out.print("Informe '-1' para encerrar a entrada. Digite a " + i + "ª temperatura: ");
      temperatura = teclado.nextDouble();
      if (temperatura != -1) {
        media += temperatura;
        if (temperatura < menor) {
          menor = temperatura;
        };
        if (temperatura > maior) {
          maior = temperatura;
        };
        i++;
      };
    };
    media /= i;
    System.out.println("Menor temperatura: " + menor);
    System.out.println("Maior temperatura: " + maior);
    System.out.println("Média das temperaturas: " + media);
    teclado.close();
  }
}
