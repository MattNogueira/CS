public class Alg04 {
  public static void main(String[] args) {
    //Declaração de variáveis//
    int populacaoA = 80000, populacaoB = 200000, anos = 0;
    //Processamento//
    while (populacaoA < populacaoB) {
      populacaoA = (int) (populacaoA * 1.03);
      populacaoB = (int) (populacaoB * 1.015);
      anos++;
    };
    //Saída de dados//
    System.out.println("Serão necessários " + anos + " anos.");
  }
}
