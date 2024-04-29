public class Empregado extends Pessoa{
  private int codigoSetor;
  private double salarioBase;
  private int imposto;

  public Empregado(int codigoSetor, double salarioBase, int imposto, String nome, String endereco, String telefone) {
    super(nome, endereco, telefone);
    this.codigoSetor = codigoSetor;
    this.salarioBase = salarioBase;
    this.imposto = imposto;
  }

  public int getCodigoSetor() {
    return codigoSetor;
  }
  public void setCodigoSetor(int codigoSetor) {
    this.codigoSetor = codigoSetor;
  }
  public double getSalarioBase() {
    return salarioBase;
  }
  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }
  public int getImposto() {
    return imposto;
  }
  public void setImposto(int imposto) {
    this.imposto = imposto;
  }

  public double calcularSalario() {
    return salarioBase - (salarioBase * imposto / 100);
  }

  public String toString() {
    return super.toString() + "\nCódigo do Setor: " + codigoSetor + "\nSalário Base: " + salarioBase + "\nImposto: " + imposto;
  }
}
