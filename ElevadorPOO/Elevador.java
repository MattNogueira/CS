public class Elevador {
  int andarAtual, totalAndares, capacidade, pessoasPresentes;

  public void Inicializar(int tA, int c) {
    andarAtual = 0;
    totalAndares = tA;
    capacidade = c;
    pessoasPresentes = 0;
  }

  public void Entrar() {
    if (pessoasPresentes < capacidade) {
      pessoasPresentes += 1;
    }
  }

  public void Sair() {
    if (pessoasPresentes > 0) {
      pessoasPresentes -= 1;
    }
  }

  public void Subir() {
    if (andarAtual < totalAndares) {
      andarAtual += 1;
    }
  }

  public void Descer() {
    if (andarAtual > 0) {
      andarAtual -= 1;
    }
  }
}
