public class Superpoder {
  private String nome;
  private int categoria;

  public Superpoder(String nome, int categoria) {
    this.nome = nome;
    this.categoria = categoria;
  }

  public Superpoder() {
    this.nome = "";
    this.categoria = 0;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getCategoria() {
    return categoria;
  }
  public void setCategoria(int categoria) {
    this.categoria = categoria;
  }
  public String toString() {
    return "Superpoder: " + nome + " Categoria: " + categoria;
  }
}
