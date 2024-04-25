public class Pessoa_Juridica extends Pessoa {
  private String cnpj;

  public Pessoa_Juridica(String nome, String telefone, String endereco, String cnpj) {
    super(nome, telefone, endereco);
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
}
