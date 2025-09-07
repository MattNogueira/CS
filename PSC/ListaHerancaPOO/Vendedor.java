public class Vendedor extends Empregado {
  private double valorVendas;
  private int comissao;

  public Vendedor(int codigoSetor, double salarioBase, int imposto, String nome, String endereco, String telefone, double valorVendas, int comissao) {
    super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
    this.valorVendas = valorVendas;
    this.comissao = comissao;
  }

  public double getValorVendas() {
    return valorVendas;
  }
  public void setValorVendas(double valorVendas) {
    this.valorVendas = valorVendas;
  }
  public int getComissao() {
    return comissao;
  }
  public void setComissao(int comissao) {
    this.comissao = comissao;
  }
  public double calcularSalario() {
    return super.calcularSalario() + (valorVendas * comissao / 100);
  }
}
