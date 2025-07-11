import java.util.Scanner;

public class StudentAluno{

    public static void main(String[] args) {

        Student estudante = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        estudante.name = scanner.nextLine();

        System.out.println("Nota do primeiro trimestre (0-30): ");
        estudante.grade1 = scanner.nextDouble();

        System.out.println("Nota do segundo trimestre (0-35): ");
        estudante.grade2 = scanner.nextDouble();

        System.out.println("Nota do terceiro trimestre (0-35): ");
        estudante.grade3 = scanner.nextDouble();

        System.out.println("Nota final do aluno sera: "+estudante.FinalGrade());

        if (estudante.FinalGrade() >= 60) {
    
           System.out.println("PASS");
        } else {
           System.out.println("FAILED");

        System.out.println("Nota que falta para a media: "+estudante.missingPoints());
        }

        scanner.close();

    }
}