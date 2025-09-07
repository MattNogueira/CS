public class Empregado {
  private String nome, sobrenome;
  private double salario;

  public void inicializar(String nome, String sobrenome, double salario) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    if (salario < 0) {
      this.salario = 0;
    } else {
      this.salario = salario;
    }
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getSobrenome() {
    return sobrenome;
  }
  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }
  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String calcularSalarioAnual() {
    return String.format("%.1f", this.salario * 12);
  }
  
  
}
