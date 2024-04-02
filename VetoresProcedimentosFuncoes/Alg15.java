import java.util.Scanner;

public class Alg15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 1;
    int c = 0;
    int n = 1;
    do {
      System.out.println("Insira um número inteiro positivo: ");
      n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        System.out.println(a);
        c = a + b;
        a = b;
        b = c;
        if (n <= 0) {
          System.out.println("O número deve ser positivo.");
        }
      }
    } while (n <= 0);
    
    sc.close();
  }
}
