import java.util.Scanner;

public class Alg23 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    boolean primo = true;
    System.out.print("Digite um número inteiro: ");
    int alvo = teclado.nextInt(), divisoes = 0;
    String listaPrimos = "";
    for (int i = 2; (i <= alvo); i += 2) {
      for (int j = 2; (j < i); j += 2) {
        divisoes++;
        if (i % j == 0) {
          primo = false;
        }
        if (j == 2) {
            j -= 1;
        }
      }
      if (primo) {
        listaPrimos += Integer.toString(i) + ", ";
      }
      primo = true;
      if (i == 2) {
        i -= 1;
      }
    }
    System.out.println("Entre 1 e " + alvo + ": " + listaPrimos.replaceAll(", $", "") + " são primos.");
    System.out.println(divisoes + " divisões realizadas");
    teclado.close();
  }
}
