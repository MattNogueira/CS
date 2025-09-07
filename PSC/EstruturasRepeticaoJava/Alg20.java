import java.util.Scanner;

public class Alg20 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    boolean pare = false;
    String resposta;
    int num;
    while (!pare) {
      System.out.print("Digite o número para calcular o fatorial: ");
      num = teclado.nextInt();
      if (num < 0 || num > 15) {
        System.out.println("Número inválido.");
      } else {
        long fatorial = 1;
        System.out.print(num + "! = ");
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
            if (i < num) {
            System.out.print(i + ".");
            };
        };
        System.out.println(num + " = " + fatorial);
        System.out.println("Deseja parar? (S/N)");
        resposta = teclado.next().toUpperCase();
        if (resposta.equals("S")) {
            pare = true;
        }
      }
    }
    teclado.close();
  }
}
