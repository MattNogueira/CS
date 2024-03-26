import java.util.Scanner;

public class Alg3 {
  public static void main(String[] args){
    //Declaração de variáveis//
    Scanner teclado = new Scanner(System.in);
    String nome, sexo, estadoCivil;
    int idade;
    double salario;
    //Entrada, processamento e saída de dados//
    System.out.println("Digite seu nome: ");
    nome = teclado.next();
    while (nome.length() <= 3){
      System.out.println("Nome inválido, digite novamente: ");
      nome = teclado.next();
    };
    System.out.println("Digite sua idade: ");
    idade = teclado.nextInt();
    while ((idade < 0) || (idade > 150)) {
      System.out.println("Idade inválida, digite novamente: ");
      idade = teclado.nextInt();
    };
    System.out.println("Digite seu salário: ");
    salario = teclado.nextDouble();
    while (salario <= 0) {
      System.out.println("Salário inválido, digite novamente: ");
      salario = teclado.nextDouble();
    };
    System.out.println("Digite seu sexo (m ou f): ");
    sexo = teclado.next();
    while ((!sexo.equals("m")) && (!sexo.equals("f"))){
    System.out.println("Sexo inválido, digite novamente: ");
    sexo = teclado.next();
    };
    System.out.println("Digite seu estado civil (s, c, v ou d): ");
    estadoCivil = teclado.next();
    while ((!estadoCivil.equals("s")) && (!estadoCivil.equals("c")) && (!estadoCivil.equals("v")) && (!estadoCivil.equals("d"))) {
      System.out.println("Estado civil inválido, digite novamente: ");
      estadoCivil = teclado.next();
    };
    System.out.println("Dados válidos");
    teclado.close();
  }
}
