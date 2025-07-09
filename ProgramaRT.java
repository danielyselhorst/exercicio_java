import java.util.Scanner;
public class ProgramaRT{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o valor da altura: ");
        retangulo.altura = scanner.nextDouble();

        System.out.println("Digite o valor da largura: ");
        retangulo.largura = scanner.nextDouble();

        retangulo.mensagem();

        System.out.println("O valor da area e: "+retangulo.area());
        System.out.println("O valor da perimetro e: "+retangulo.perimetro());
        System.out.println("O valor da diagonal e: "+retangulo.diagonal());
        
        scanner.close();
    }
}