import java.util.Scanner;

public class Alg37 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int codigo, codigoMaior = 0, codigoMenor = 0, codigoGordo = 0, codigoMagro = 0, clientes = 0;
    double altura, alturaMaior = 0, alturaMenor = 0, peso, pesoGordo = 0, pesoMagro = 0, mediaAltura = 0, mediaPeso = 0;
    do {
      System.out.println("Digite o código do cliente: ");
      codigo = teclado.nextInt();
      if ((codigo != 0) && (codigo > 0)) {
        System.out.println("Digite a altura do cliente: ");
        altura = teclado.nextDouble();
        System.out.println("Digite o peso do cliente: ");
        peso = teclado.nextDouble();
        if ((peso <= 0) || (altura <= 0)) {
          System.out.println("Peso ou altura inválidos. Digite novamente.");
        } else {
          if (altura > alturaMaior) {
            alturaMaior = altura;
            codigoMaior = codigo;
          }
          if (altura < alturaMenor || alturaMenor == 0) {
            alturaMenor = altura;
            codigoMenor = codigo;
          }
          if (peso > pesoGordo) {
            pesoGordo = peso;
            codigoGordo = codigo;
          }
          if (peso < pesoMagro || pesoMagro == 0) {
            pesoMagro = peso;
            codigoMagro = codigo;
          }
          mediaAltura += altura;
          mediaPeso += peso;
          clientes++;
        }
      } else {
        System.out.println("Código inválido. Digite novamente.");
      }
    } while (codigo != 0);
    mediaAltura /= clientes;
    mediaPeso /= clientes;
    System.out.println("O cliente mais alto é o de código " + codigoMaior + " com altura " + alturaMaior + "m.");
    System.out.println("O cliente mais baixo é o de código " + codigoMenor + " com altura " + alturaMenor + "m.");
    System.out.println("O cliente mais gordo é o de código " + codigoGordo + " com peso " + pesoGordo + "kg.");
    System.out.println("O cliente mais magro é o de código " + codigoMagro + " com peso " + pesoMagro + "kg.");
    System.out.println("A média das alturas dos clientes é " + mediaAltura + "m.");
    System.out.println("A média dos pesos dos clientes é " + mediaPeso + "kg.");
    teclado.close();
  }
}
