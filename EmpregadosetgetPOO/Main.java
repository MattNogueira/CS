public class Main {
  public static void main(String[] args) {
    Empregado Primeiro = new Empregado();
    Empregado Segundo = new Empregado();

    Primeiro.inicializar("Matheus", "Silva", 1600);
    Segundo.inicializar("Jorge", "Chaves", -6000);

    System.out.println("O funcionário " + Primeiro.getNome() + " " + Primeiro.getSobrenome() + " recebe R$" + Primeiro.calcularSalarioAnual() + " por ano." );
    System.out.println("O funcionário " + Segundo.getNome() + " " + Segundo.getSobrenome() + " recebe R$" + Segundo.calcularSalarioAnual() + " por ano." );

    System.out.println("\nUm muda o salario...");
    Segundo.setSalario(6000);

    System.out.println("Após um aumento de 10% no salário dos funcionários...");
    Primeiro.setSalario(Primeiro.getSalario()*1.1);
    Segundo.setSalario(Segundo.getSalario()*1.1);

    System.out.println("Um muda o nome, o outro o sobrenome...");
    Primeiro.setNome("Tiago");
    Segundo.setSobrenome("Gerson");
    
    System.out.println("\nO funcionário " + Primeiro.getNome() + " " + Primeiro.getSobrenome() + " recebe R$" + Primeiro.calcularSalarioAnual() + " por ano." );
    System.out.println("O funcionário " + Segundo.getNome() + " " + Segundo.getSobrenome() + " recebe R$" + Segundo.calcularSalarioAnual() + " por ano." );

  }
}
