import java.util.Scanner;

public class ProgramaEmployee{


public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Employee funcionario = new Employee();

    System.out.println("Nome do funcionário: ");
    funcionario.name = scanner.nextLine();

    System.out.print("Salário bruto: ");
    funcionario.grossSalary = scanner.nextDouble();

    System.out.print("Imposto: ");
    funcionario.tax = scanner.nextDouble();


    System.out.println("\nfuncionário: "+funcionario.name);
    System.out.print("\nDigite o valor percentual de aumento: ");
    double percentual = scanner.nextDouble();
    funcionario.IncreaseSalary(percentual);

    System.out.println("\nDados atualizados :"+funcionario);

     

    System.out.println("\nDados do funcionário após o aumento:");
    scanner.close();
    }
}