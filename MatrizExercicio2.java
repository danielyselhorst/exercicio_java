public class MatrizExercicio2 {
public static void main(String[] args) {

int[][] matriz = new int[3][5];
int pares = 0;
int impares = 0;

// Preencher matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 5; j++) {
matriz[i][j] = (int)(Math.random() * 101);
}
}

 // Exibir matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 5; j++) {
System.out.print("\t" + matriz[i][j]);
}
System.out.println();
}
// Contar pares e ímpares
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 5; j++) {
if (matriz[i][j] % 2 == 0) {
pares++;
} else {
impares++;
}
}
}

// Exibir resultados
System.out.println("Quantidade de numeros pares: " + pares);
System.out.println("Quantidade de numeros impares: " + impares);
}
}

    




