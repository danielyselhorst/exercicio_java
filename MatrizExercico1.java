public class MatrizExercico1 {
public static void main(String[] args) {

int[][] matriz = new int[5][5];

// Preencher a matriz
for(int i = 0; i < 5; i++){
for(int j = 0; j < 5; j++){
matriz[i][j] = (int)(Math.random() * 101);
}
}

// Exibir a matriz
for(int i = 0; i < 5; i++){
for(int j = 0; j < 5; j++){
System.out.print(matriz[i][j] + " ");
}
System.out.println();
}

// Somar cada linha
for(int i = 0; i < 5; i++){
int somaLinha = 0;
for(int j = 0; j < 5; j++){
somaLinha += matriz[i][j];
}
System.out.printf("Linha %d: %d%n", i, somaLinha);
}

// Somar cada coluna
for(int j = 0; j < 5; j++){
int somaColuna = 0;
for(int i = 0; i < 5; i++){
somaColuna += matriz[i][j];
}
System.out.printf("Coluna %d: %d%n", j, somaColuna);
}

// Somar todos os ímpares
int somaImpar = 0;
for(int i = 0; i < 5; i++){
for(int j = 0; j < 5; j++){
if(matriz[i][j] % 2 != 0){
somaImpar += matriz[i][j];
}
}
}
System.out.printf("Soma dos ímpares: %d%n", somaImpar);
}
}
