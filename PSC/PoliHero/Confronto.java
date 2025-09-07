public class Confronto {

  public int executar(SuperHeroi superheroi, Vilao vilao) {
    int poderTotalSuperHeroi = superheroi.getPoderTotal();
    int poderTotalVilao = vilao.getPoderTotal();
    if (poderTotalSuperHeroi > poderTotalVilao) {
      return 1;
    } else if (poderTotalSuperHeroi < poderTotalVilao) {
      return 2;
    } else {
      return 0;
    }
  }
}
