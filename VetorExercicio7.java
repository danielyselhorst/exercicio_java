import java.util.Scanner;

public class VetorExercicio7{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

List pares = new ArrayList();
List impares = new ArrayList();
int somaPares = 0;
int quantidadeImpares = 0;

System.out.println("Digite 6 números inteiros:");

for (int i = 0; i < 6; i++) {

int numero = scanner.nextInt();

if (numero % 2 == 0) {
pares.add(numero);
somaPares += numero;

} else {

impares.add(numero);
quantidadeImpares++;
}
}

System.out.println("Números pares: " + pares);
System.out.println("Soma dos números pares: " + somaPares);
System.out.println("Números ímpares: " + impares);
System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
}
}
