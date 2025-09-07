public class Main {
  public static void main(String[] args) {
    Fatura fatura = new Fatura(1, "Mouse", 2, 20.0);
    System.out.println(fatura.toString());
    System.out.println("Valor da fatura: " + fatura.getcalcular_valor_fatura() + "\n");
    Fatura fatura2 = new Fatura(2, "Teclado", -1, 50.0);
    System.out.println(fatura2.toString());
    System.out.println("Valor da fatura: " + fatura2.getcalcular_valor_fatura() + "\n");
  }
}
