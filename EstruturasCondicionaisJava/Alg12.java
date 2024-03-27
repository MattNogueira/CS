import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alg12 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner teclado = new Scanner(System.in);
    DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String categoria, dataNascimento, dataAtual = formataData.format(LocalDate.now()), array[];
    int diaNascimento, mesNascimento, anoNascimento, diaAtual, mesAtual, anoAtual, idade;
    Boolean erro = false;
    System.out.println("Informe a data de nascimento do atleta (dd/mm/aaaa)");
    dataNascimento = teclado.nextLine().replaceAll("-", "/");
    dataNascimento = formataData.format(LocalDate.parse(dataNascimento, formataData));
    //Saída de Dados//
    array = dataNascimento.split("/");
    diaNascimento = Integer.parseInt(array[0]);
    mesNascimento = Integer.parseInt(array[1]);
    anoNascimento = Integer.parseInt(array[2]);
    array = dataAtual.split("/");
    diaAtual = Integer.parseInt(array[0]);
    mesAtual = Integer.parseInt(array[1]);
    anoAtual = Integer.parseInt(array[2]);
    if ((mesAtual >= mesNascimento) && (diaAtual >= diaNascimento)) {
      idade = anoAtual - anoNascimento;
    } else {
      idade = anoAtual - anoNascimento - 1;
    };
    if ((idade > 0) && (idade <= 10)) {
      categoria = "Infantil";
    } else if ((idade > 10) && (idade <= 17)) {
      categoria = "Juvenil";
    } else if ((idade > 17) && (idade <= 59)) {
      categoria = "Adulto";
    } else if (idade > 59) {
      categoria = "Sênior";
    } else {
      erro = true;
      categoria = "";
    };
    if ((erro == false) && (idade != 1)) {
      System.out.println("O atleta tem " + idade + " anos e sua categoria é " + categoria);
    } else if ((erro == false) && (idade == 1)) {
      System.out.println("O atleta tem " + idade + " ano e sua categoria é " + categoria);
    } else {
      System.out.println("Data de nascimento inválida");
    };
  }
}

