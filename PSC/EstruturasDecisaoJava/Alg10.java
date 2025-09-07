import java.util.Scanner;

public class Alg10 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    Scanner input = new Scanner(System.in);
    String destino, prefRota, duracaoRota, custoRota;
    int escalaRota;
    Boolean erro = false;
    //Entrada de dados//
    System.out.println("Digite o destino: ");
    destino = input.nextLine().toLowerCase().replaceAll("t[^\\p{ASCII}]quio", "toquio");
    destino = destino.replaceAll("nova [iy]or[kque]+", "nova york");
    System.out.println("Digite a preferência de rota: ");
    prefRota = input.nextLine().toLowerCase().replaceAll("r[^\\p{ASCII}]pid[ao]", "rapida");
    prefRota = prefRota.replaceAll("barat[ao]", "barata");
    escalaRota = 0;
    duracaoRota = "";
    custoRota = "";
    //Saída de dados//

    if (prefRota.equals("barata")) {
      if (destino.equals("paris")) {
        duracaoRota = "12h";
        custoRota = "R$ 750,00";
        escalaRota = 2;
      } else if (destino.equals("nova york")) {
        duracaoRota = "20h";
        custoRota = "R$ 500,00";
        escalaRota = 4;
      } else if (destino.equals("toquio")) {
        duracaoRota = "25h";
        custoRota = "R$ 1000,00";
        escalaRota = 1;
      } else {
        erro = true;
      };
    }
    else if (prefRota.equals("rapida")) {
      if (destino.equals("paris")) {
        duracaoRota = "7h";
        custoRota = "R$ 900,00";
        escalaRota = 1;
      } else if (destino.equals("nova york")) {
        duracaoRota = "15h";
        custoRota = "R$ 650,00";
        escalaRota = 3;
      } else if (destino.equals("toquio")) {
        duracaoRota = "20h";
        custoRota = "R$ 1200,00";
        escalaRota = 0;
      } else {
        erro = true;
      };
    }
    else if (prefRota.equals("menos escalas")) {
      if (destino.equals("paris")) {
        duracaoRota = "10h";
        custoRota = "R$ 850,00";
        escalaRota = 1;
      } else if (destino.equals("nova york")) {
        duracaoRota = "18h";
        custoRota = "R$ 550,00";
        escalaRota = 3;
      } else if (destino.equals("toquio")) {
        duracaoRota = "22h";
        custoRota = "R$ 1100,00";
        escalaRota = 1;
      } else {
        erro = true;
      };
    } else {
      erro = true;
    };
    if (erro == false) {
      if (escalaRota == 1) {
        System.out.printf("Rota escolhida: Duração %s - Custo %s - %d escala\n", duracaoRota, custoRota, escalaRota);
      } else {
        System.out.printf("Rota escolhida: Duração %s - Custo %s - %d escalas\n", duracaoRota, custoRota, escalaRota);
      };
    } else {
      System.out.println("Destino indisponível.");
    };
  }
}