import java.util.Scanner;

public class Alg6 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner input = new Scanner(System.in);
    double consumo, tarifa;
    //Entrada de dados//
    System.out.println("Digite o consumo em kWh: ");
    consumo = input.nextDouble();
    //Saída de dados//
    if (consumo <= 100) {
      tarifa = consumo * 0.85 * 0.85;
    } else if (consumo > 100 && consumo <= 200) {
      tarifa = consumo * 0.90 * 0.85;
    } else {
      tarifa = consumo * 0.85;
    }
    System.out.printf("Valor da tarifa: R$ %.2f", tarifa);
  }
}