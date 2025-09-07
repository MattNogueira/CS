public class Personagem {
  private String nome;
  private String nomeVidaReal;
  private Superpoder[] poderes;

  public Personagem(String nome, String nomeVidaReal) {
    this.nome = nome;
    this.nomeVidaReal = nomeVidaReal;
    this.poderes = new Superpoder[4];
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNomeVidaReal() {
    return nomeVidaReal;
  }
  public void setNomeVidaReal(String nomeVidaReal) {
    this.nomeVidaReal = nomeVidaReal;
  }
  public Superpoder[] getPoderes() {
    return poderes;
  }
  public void setPoderes(Superpoder[] poderes) {
    this.poderes = poderes;
  }
  public void adicionaPoderes (Superpoder sp) {
    for (int i = 0; i < 4; i++) {
      if (poderes[i] == null) {
        poderes[i] = sp;
        break;
      }
    }
  }
  public int getPoderTotal() {
    int total = 0;
    for (int i = 0; i < 4; i++) {
      if (poderes[i] != null) {
        total += poderes[i].getCategoria();
      }
    }
    return total;
  }
  public String toString() {
    return "Personagem: " + nome + " Nome Vida Real: " + nomeVidaReal + " Poderes: " + poderes;
  }
}
