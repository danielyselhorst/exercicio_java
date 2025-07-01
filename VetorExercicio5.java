import java.util.Scanner;

public class VetorExercicio5 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

double[] notas = new double[15];
double soma = 0;
double media = 0;

System.out.println("Digite a notas de 15 alunos: ");

for(int i = 0; i <15; i++){

notas[i]= scanner.nextDouble();
soma += notas[i];
}

media = soma / 15;  

System.out.println("Media geral: "+media);
for(int i = 0; i < 15; i++){
System.out.println(notas[i]);

}

}
}