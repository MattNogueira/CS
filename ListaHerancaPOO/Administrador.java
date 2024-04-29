public class Administrador extends Empregado {
  private double ajudaDeCusto;

  Administrador(int codigoSetor, double salarioBase, int imposto, String nome, String endereco, String telefone, double ajudaDeCusto) {
    super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
    this.ajudaDeCusto = ajudaDeCusto;
  }
  public double getAjudaDeCusto() {
    return ajudaDeCusto;
  }
  public void setAjudaDeCusto(double ajudaDeCusto) {
    this.ajudaDeCusto = ajudaDeCusto;
  }
  public double calcularSalario() {
    return super.calcularSalario() + ajudaDeCusto;
  }
  public String toString() {
    return super.toString() + "\nAjuda de Custo: " + ajudaDeCusto;
  }
}
