
public class Main {
  public static void main(String[] args) {
    //teste Pessoa
    Pessoa p1 = new Pessoa("João", "Rua A", "987654321");
    System.out.println(p1.toString());
    Pessoa p2 = new Pessoa("Maria", "Rua B");
    System.out.println(p2.toString());
    Pessoa p3 = new Pessoa();
    System.out.println(p3.toString());
    //teste fornecedor
    Fornecedor fornecedor = new Fornecedor("João", "Rua A, 123", "123456789", 1000.0, 500.0);
    System.out.println(fornecedor.toString());
    System.out.printf("Saldo: %.2f\n", fornecedor.obterSaldo());
    fornecedor.setValorCredito(2000.0);
    System.out.printf("Saldo: %.2f\n", fornecedor.obterSaldo());
    //teste empregado
    Empregado empregado = new Empregado(1, 1000.0, 10, "João", "Rua A, 123", "123456789");
    System.out.println(empregado.toString());
    System.out.printf("Salário: %.2f\n", empregado.calcularSalario());
    empregado.setSalarioBase(1500);
    System.out.printf("Salário: %.2f\n", empregado.calcularSalario());
    //teste administrador
    Administrador administrador = new Administrador(2, 2000.0, 20, "Maria", "Rua B, 456", "987654321", 1000.0);
    System.out.println(administrador.toString());
    System.out.printf("Salário: %.2f\n", administrador.calcularSalario());
    //teste operario
    Operario operario = new Operario(3, 3000.0, 30, "Pedro", "Rua C, 789", "555555555", 1000.0, 10);
    System.out.println(operario.toString());
    System.out.printf("Salário: %.2f\n", operario.calcularSalario());
    //teste vendedor
    Vendedor vendedor = new Vendedor(4, 4000.0, 40, "Ana", "Rua D, 101", "999999999", 2000.0, 10);
    System.out.println(vendedor.toString());
    System.out.printf("Salário: %.2f\n", vendedor.calcularSalario());
  }
}
