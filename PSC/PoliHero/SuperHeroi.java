public class SuperHeroi extends Personagem {

  public SuperHeroi(String nome, String nomeVidaReal) {
    super(nome, nomeVidaReal);
  }
  public int getPoderTotal() {
    int total = 0;
    for (int i = 0; i < 4; i++) {
      if (getPoderes()[i] != null) {
        total += getPoderes()[i].getCategoria();
      }
    }
    return (int) (total + (total * 0.1));
  }
}
