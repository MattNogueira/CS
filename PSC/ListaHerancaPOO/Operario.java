public class Operario extends Empregado {
  private double valorProducao;
  private int comissao;

  Operario(int codigoSetor, double salarioBase, int imposto, String nome, String endereco, String telefone, double valorProducao, int comissao) {
    super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
    this.valorProducao = valorProducao;
    this.comissao = comissao;
  }
  public double getValorProducao() {
    return valorProducao;
  }
  public void setValorProducao(double valorProducao) {
    this.valorProducao = valorProducao;
  }
  public int getComissao() {
    return comissao;
  }
  public void setComissao(int comissao) {
    this.comissao = comissao;
  }
  public double calcularSalario() {
    return super.calcularSalario() + (valorProducao * comissao / 100);
  }
}
