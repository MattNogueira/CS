public class Fatura {
  private String descricao;
  private int numero, quantidade;
  private double preco;

  public Fatura(int numero, String descricao, int quantidade, double preco) {
    this.numero = numero;
    this.descricao = descricao;
    if (quantidade > 0) {
      this.quantidade = quantidade;
    } else {
      this.quantidade = 0;
    }
    if (preco > 0) {
      this.preco = preco;
    } else {
      this.preco = 0;
    }
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    if (quantidade > 0) {
      this.quantidade = quantidade;
    } else {
      this.quantidade = 0;
    }
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    if (preco > 0) {
      this.preco = preco;
    } else {
      this.preco = 0;
    }
  }

  public double getcalcular_valor_fatura() {
    return quantidade * preco;
  }

  public String toString() {
    return "Número: " + numero + "\nDescrição: " + descricao + "\nQuantidade: " + quantidade + "\nPreço: " + preco + "\n";
  }
}
