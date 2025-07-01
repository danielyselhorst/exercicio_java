public class MatrizExercicio5 {
public static void main(String[] args) {

int[][] matriz = new int[3][3];

// Preencher matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
matriz[i][j] = (int)(Math.random() * 101);
}
}
int somaRefernecia = matriz[0][0] + matriz[0][1] + matriz[0][2];
boolean verifica = false;

// for para verificar a soma das linhas
for(int i = 0; i < 3; i++){
int somaLinha = 0;
for(int j = 0; j < 3; j++){
somaLinha += matriz[i][j];

}
System.out.printf("Linha %d: %d%n", i, somaLinha);
}

// for para verificar a soma das colunas
for(int j = 0; j < 3; j++){
int somaColuna = 0;
for(int i = 0; i < 3; i++){
somaColuna += matriz[i][j];

}
System.out.printf("Coluna %d: %d%n", j, somaColuna);
}

//verificar a diagonal principal
System.out.println("Diagonal principal:");
for (int i = 0; i < 3; i++) {
System.out.println(matriz[i][i] + " ");

}


//verificar a diagonal secundaria
System.out.println("Diagonal secundária:");
for (int i = 0; i < 3; i++) {
System.out.println(matriz[i][2 - i] + " ");

}


//mostrar mensagem se e ou nao quadrado magico
if (verifica) {
System.out.println("E um quadrado magico");
} else {
System.out.println("nao e um quadrado magico");
}
}
}