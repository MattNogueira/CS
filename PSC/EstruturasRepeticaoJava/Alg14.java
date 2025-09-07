import java.util.Scanner;

public class Alg14 {
    public static void main(String[] agrs) {
        Scanner teclado = new Scanner(System.in);
        int contPar = 0, contImp = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número inteiro: ");
            int num = teclado.nextInt();
            if (num % 2 == 0) {
                contPar++;
            } else {
                contImp++;
            };
        }
        System.out.println("Você informou " + contPar + " números pares e " + contImp + " números ímpares.");
        teclado.close();
    }
}
