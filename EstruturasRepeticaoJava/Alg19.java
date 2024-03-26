import java.util.Scanner;

public class Alg18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de elementos do conjunto: ");
        int n = teclado.nextInt();
        int menor = 1000, maior = 0, soma = 0, num = 1001;
        for (int i = 1; i <= n; i++) {
            do {
                System.out.print("Digite o " + i + "º número (0-1000): ");
                num = teclado.nextInt();
            }
            while ((num <= 0)||(num>=1000));
            if (num < menor) {
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }
            soma += num;
        }
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);
        teclado.close();
    }
}
