public class Vilao extends Personagem {
  int tempoDePrisao;

  public Vilao(String nome, String nomeVidaReal, int tempoDePrisao) {
    super(nome, nomeVidaReal);
    this.tempoDePrisao = tempoDePrisao;
  }
  public int getTempoDePrisao() {
    return tempoDePrisao;
  }
  public void setTempoDePrisao(int tempoDePrisao) {
    this.tempoDePrisao = tempoDePrisao;
  }
}
