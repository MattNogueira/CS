import java.util.Scanner;

public class Alg13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 2;

    System.out.println("Insira um número inteiro: ");
    int n = sc.nextInt();
    while (i <= n) {
      boolean isPrime = true;
      int j = 2;
      while (j < i) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
        j++;
      }
      if (isPrime) {
        System.out.println(i);
      }
      i++;
    }
  }
}
