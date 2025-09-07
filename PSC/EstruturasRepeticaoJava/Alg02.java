import java.util.Scanner;
public class Alg02 {
  public static void main(String[] args) {
    // Declaração de variáveis//
    Scanner teclado = new Scanner(System.in);
    String nome, senha;
    // Entrada de dados//
    System.out.println("Digite seu nome de usuário: ");
    nome = teclado.next();
    System.out.println("Digite sua senha: ");
    senha = teclado.next();
    // Processamento e saída de dados//
    while (nome.equals(senha)) {
      System.out.println("Senha inválida, digite novamente: ");
      senha = teclado.next();
    }
    System.out.println("Senha válida");
    teclado.close();
  }
}
