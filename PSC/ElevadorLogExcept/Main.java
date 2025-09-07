import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class Main {
  public static void main(String[] args) {
    Elevador elevador = new Elevador();
    Scanner pc = new Scanner(System.in);
    boolean erro = false;

    LocalDateTime data = LocalDateTime.now();
    File log = new File ("log" + DateTimeFormatter.ofPattern("dd-MM-yyyy").format(data) + ".txt");
    FileWriter fw = null;
    BufferedWriter bw = null;

    try {
      log.createNewFile();
      fw = new FileWriter(log, true);
      bw = new BufferedWriter(fw);
    } catch (IOException ex) {
      System.err.println("Error initializing FileWriter: " + ex.getMessage());
    }
    //Criando o Elevador
    while (!erro) {
      try {
        System.out.print("Total de andares do prédio: ");
        int tA = pc.nextInt();
        System.out.print("Capacidade do elevador: ");
        int c = pc.nextInt();
        elevador.Inicializar(tA, c);
      }
      catch (IllegalArgumentException e) {
        try {
          bw.write("Erro: " + e.getMessage());
          bw.newLine();
        }
        catch (IOException ex) {
          System.err.println("Error initializing FileWriter: " + ex.getMessage());
        }
        continue;
      }
      erro = true;
    }

    //Operações
    while (true) {
      //Informando o destino
      int andar = 0;
      try {
        System.out.print("Destino: ");
        andar = pc.nextInt();
        if (andar < 0 || andar > elevador.totalAndares) {
          throw new IllegalArgumentException("Andar inválido");
        }
      }
      catch (IllegalArgumentException e2) {
        try {
          bw.write("Erro: " + e2.getMessage());
          bw.newLine();
        }
        catch (IOException ex) {
          System.err.println("Error initializing FileWriter: " + ex.getMessage());
        }
        continue;
      }
      //Subindo ou descendo
      while (elevador.andarAtual != andar) {
        try {
          if (elevador.andarAtual < andar) {
            elevador.Subir();
          } else {
            elevador.Descer();
          }
        }
        catch (IllegalArgumentException e3) {
          try {
            bw.write("Erro: " + e3.getMessage());
            bw.newLine();
          }
          catch (IOException ex) {
            System.err.println("Error initializing FileWriter: " + ex.getMessage());
          }
          continue;
        }
        //Pessoas entram e saem
        while (true) {
          try {
            System.out.print("Pessoas entrando: ");
            int pE = pc.nextInt();
            int pS = 0;
            if (elevador.pessoasPresentes != 0) {
              System.out.print("Pessoas saindo: ");
              pS = pc.nextInt();
            }
            if (pE < 0 || pS < 0) {
              throw new IllegalArgumentException("Número não pode ser negativo");
            }
            for (int i = 0; i < pE; i++) {
              elevador.Entrar();
            }
            for (int i = 0; i < pS; i++) {
              elevador.Sair();
            }
            break;
          }
          catch (IllegalArgumentException e4) {
            try {
              bw.write("Erro: " + e4.getMessage());
              bw.newLine();
            }
            catch (IOException ex) {
              System.err.println("Error initializing FileWriter: " + ex.getMessage());
            }
            continue;
          }
        }
      }
      //Encerrando o programa
      try {
        System.out.print("Encerrar? (s/n): ");
        String encerrar = pc.next().toLowerCase();
        if (encerrar.equals("s")) {
          if (elevador.pessoasPresentes != 0) {
            throw new Exception(elevador.pessoasPresentes + " pessoas ainda estão no elevador");
          } else {
            System.out.println("Encerrando...");
            if (elevador.andarAtual != 0) {
              for (int i = 0; i < elevador.andarAtual; i++){
                elevador.Descer();
              }
              System.out.println("Elevador encerrado!");
              break;
            } else {
              System.out.println("Elevador encerrado!");
              break;
            }
          }
        } else if (encerrar.equals("n")) {
          continue;
        } else {
          throw new IllegalArgumentException("Opção inválida");
        }
      }
      catch (IllegalArgumentException e5) {
        try {
          bw.write("Erro: " + e5.getMessage());
          bw.newLine();
        }
        catch (IOException ex) {
          System.err.println("Error initializing FileWriter: " + ex.getMessage());
        }
        continue;
      }
      catch (Exception e6) {
        try {
          bw.write("Erro: " + e6.getMessage());
          bw.newLine();
        }
        catch (IOException ex) {
          System.err.println("Error initializing FileWriter: " + ex.getMessage());
        }
        continue;
      }
    }
    pc.close();
    try {
      bw.close();
      fw.close();
    }
    catch (IOException ex) {
      System.err.println("Error initializing FileWriter: " + ex.getMessage());
    }
  }
}
