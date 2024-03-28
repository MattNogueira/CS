import java.util.Scanner;

public class Alg41 {
  public static void main(String[] args) {
    //Declaração de variáveis
    Scanner teclado = new Scanner(System.in);
    int dividaWidth = 16, jurosWidth = 16, qParcelaWidth = 23, vParcelaWidth = 16;
    double juros = 10, divida, taxa, valorParcela;
    //Processamento de dados e saída
    System.out.print("Digite o valor da dívida: ");
    divida = teclado.nextDouble();
    System.out.println(String.format("%-" + (dividaWidth - 1) + "s%-" + (jurosWidth - 1) + "s%-" 
  + (qParcelaWidth - 1) + "s%-" + vParcelaWidth + "s", "Valor da dívida ", "Valor dos juros ", "Quantidade de parcelas ", "Valor da parcela"));
    for (int i = 0; i <= 12; i += 3) {
      if (i == 0) {
        i = 1;
        juros = 0;
        String formattedDivida = String.format("%-" + dividaWidth + ".2f", divida);
        String formattedJuros = String.format("%-" + jurosWidth + "d", (int) juros);
        String formattedQParcela = String.format("%-" + qParcelaWidth + "d", i);
        String formattedVParcela = String.format("%-" + vParcelaWidth + ".2f", divida);
        System.out.println(formattedDivida + formattedJuros + formattedQParcela + formattedVParcela);
        i = 0;
        juros = 10;
      }
      if (i >= 3) {
        taxa = (juros/100+1);
        valorParcela = divida * (taxa / i);
        String formattedDivida = String.format("%-" + dividaWidth + ".2f", divida * taxa);
        String formattedJuros = String.format("%-" + jurosWidth + ".2f", (divida * taxa) - divida);
        String formattedQParcela = String.format("%-" + qParcelaWidth + "d", i);
        String formattedVParcela = String.format("%-" + vParcelaWidth + ".2f", valorParcela);
        System.out.println(formattedDivida + formattedJuros + formattedQParcela + formattedVParcela);
        juros += 5;
      }
    }
    teclado.close();
  }
}
