import java.util.Scanner;

public class Alg40 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int codigo, numV, numA, maiorA = 0, menorA = 0, codigoMenorA = 0, codigoMaiorA = 0, mediaV = 0, mediaA = 0, totalA = 0;

    for (int i = 1; i <= 5; i++) {
      System.out.print("Digite o código da cidade: ");
      codigo = teclado.nextInt();
      System.out.print("Digite o número de veículos de passeio: ");
      numV = teclado.nextInt();
      System.out.print("Digite o número de acidentes de trânsito com vítimas: ");
      numA = teclado.nextInt();
      if (maiorA < numA || maiorA == 0) {
        maiorA = numA;
        codigoMaiorA = codigo;
      }
      if (menorA > numA || menorA == 0) {
        menorA = numA;
        codigoMenorA = codigo;
      }
      mediaV += numV;
      if (numV < 2000) {
        totalA++;
        mediaA += numA;
      }
    }
    mediaV /= 5;
    mediaA /= totalA;
    System.out.println("O maior índice de acidentes de trânsito ocorreu na cidade de código " + codigoMaiorA + " com " + maiorA + " acidentes.");
    System.out.println("O menor índice de acidentes de trânsito ocorreu na cidade de código " + codigoMenorA + " com " + menorA + " acidentes.");
    System.out.println("A média de veículos de passeio nas 5 cidades é: " + mediaV + " veículos.");
    System.out.println("A média de acidentes de trânsito nas cidades com menos de 2000 veículos de passeio é: " + mediaA + " acidentes.");
    teclado.close();
  }
}
