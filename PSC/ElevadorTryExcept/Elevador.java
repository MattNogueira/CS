public class Elevador {
  int andarAtual, totalAndares, capacidade, pessoasPresentes;

  public void Inicializar(int tA, int c) {
    andarAtual = 0;
    totalAndares = tA;
    capacidade = c;
    pessoasPresentes = 0;

    if (tA <= 0) {
      throw new IllegalArgumentException("Total de andares inválido");
    }
    if (c <= 0) {
      throw new IllegalArgumentException("Capacidade inválida");
    }
  }

  public void Entrar() {
    if (pessoasPresentes < capacidade) {
      pessoasPresentes += 1;
    } else {
      throw new IllegalArgumentException("Elevador lotado");
    }
  }

  public void Sair() {
    if (pessoasPresentes > 0) {
      pessoasPresentes -= 1;
    } else {
      throw new IllegalArgumentException("Não há pessoas no elevador");
    }
  }

  public void Subir() {
    if (andarAtual < totalAndares) {
      andarAtual += 1;
    } else {
      throw new IllegalArgumentException("Já está no último andar");
    }
  }

  public void Descer() {
    if (andarAtual > 0) {
      andarAtual -= 1;
    } else {
      throw new IllegalArgumentException("Já está no térreo");
    }
  }
}
