import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Elevador elevador = new Elevador();
    Scanner pc = new Scanner(System.in);
    boolean erro = false;

    //Criando o Elevador
    while (!erro) {
      System.out.print("Total de andares do prédio: ");
      int tA = pc.nextInt();
      if (tA <= 0) {
        System.out.println("Valor inválido!");
        continue;
      }
      System.out.print("Capacidade do elevador: ");
      int c = pc.nextInt();
      if (c <= 0) {
        System.out.println("Valor inválido!");
        continue;
      }
      erro = true;
      elevador.Inicializar(tA, c);
    }

    //Operações
    while (true) {
      //Informando o destino
      System.out.print("Destino: ");
      int andar = pc.nextInt();
      if (andar < 0 || andar > elevador.totalAndares) {
        System.out.println("Valor inválido!");
        continue;
      } else {
        //Subindo ou descendo
        while (elevador.andarAtual != andar) {
          if (elevador.andarAtual < andar) {
            elevador.Subir();
          } else {
            elevador.Descer();
          }
          //Pessoas entram e saem
          while (true) {
                       
            System.out.print("Pessoas entrando: ");
            int pE = pc.nextInt();
            int pS = 0;
            //Só sai se tiver gente
            if (elevador.pessoasPresentes != 0) {
              System.out.print("Pessoas saindo: ");
              pS = pc.nextInt();
            }
            if (pE < 0 || pS < 0) {
              System.out.println("Valor inválido!");
              continue;
            } else {
              for (int i = 0; i < pE; i++) {
                elevador.Entrar();
              }
              for (int i = 0; i < pS; i++) {
                elevador.Sair();
              }
              break;
            }
          }
        }
      }
      //Encerrando o programa
      System.out.print("Encerrar? (s/n): ");
      String encerrar = pc.next().toLowerCase();
      if (encerrar.equals("s")) {
        if (elevador.pessoasPresentes != 0) {
          System.out.println("Não é possível encerrar o elevador, pois há " + elevador.pessoasPresentes + " pessoas presentes!");
        } else {
          System.out.println("Encerrando...");
          if (elevador.andarAtual != 0) {
            System.out.println("O elevador não está no térreo!");
          } else {
            System.out.println("Elevador encerrado!");
            break;
          }
        }
      }
    }
    pc.close();
  }
}
