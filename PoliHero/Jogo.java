public class Jogo {
  public static void main(String[] args) {
    SuperHeroi miranha = new SuperHeroi("Homem-Aranha", "Peter Park");
    Vilao doente = new Vilao("Duende Verde", "Norman Osbourne", 0);
    Confronto confronto = new Confronto();

    miranha.adicionaPoderes(new Superpoder("soltar teia", 3));
    miranha.adicionaPoderes(new Superpoder("andar nas paredes", 2));
    miranha.adicionaPoderes(new Superpoder("sentido apurado", 1));

    doente.adicionaPoderes(new Superpoder("Força", 5));

    //Confronto
    int resultado = confronto.executar(miranha, doente);
    if (resultado == 1) {
      System.out.println(miranha.getNome() + " venceu!");
    } else if (resultado == 2) {
      System.out.println(doente.getNome() + " venceu!");
    } else {
      System.out.println("Empate!");
    }
  }
}
