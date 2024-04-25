public class Main {
  public static void main(String[] args) {
    Fornecedor fornecedor = new Fornecedor("João", "Rua A, 123", "123456789", 1000.0, 500.0);

    System.out.println("Nome: " + fornecedor.getNome());
    System.out.println("Endereço: " + fornecedor.getEndereco());
    System.out.println("Telefone: " + fornecedor.getTelefone());
    System.out.println("Valor do Crédito: " + fornecedor.getValorCredito());
    System.out.println("Valor da Dívida: " + fornecedor.getValorDivida());
    System.out.println(fornecedor.getNome() + " possui um saldo de " + fornecedor.obterSaldo());
  }
}
