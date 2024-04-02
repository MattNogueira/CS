import java.util.Scanner;

public class Alg14 {
  public static void main(String[] args) {
    int numEtapas;
    int tempo;
    Scanner teclado = new Scanner(System.in);

    do {
      System.out.println("Digite o número de etapas: ");
      numEtapas = teclado.nextInt();
      if (numEtapas <= 0) {
        System.out.println("O número deve ser positivo.");
      }
    } while (numEtapas <= 0);
    tempo = numEtapas* 30;
    System.out.println("O tempo total de produção é: " + (tempo) + " minutos");
    
  }
}
