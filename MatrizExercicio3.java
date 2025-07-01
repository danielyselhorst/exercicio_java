public class MatrizExercicio3 {
    public static void main(String[] args) {
int[][] matriz = new int[4][4];

// Preencher matriz
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
matriz[i][j] = (int)(Math.random() * 101);
}
}

// Exibir matriz
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
System.out.print("\t" + matriz[i][j]);
}
System.out.println();
}

// Diagonal principal (índice linha == coluna)
System.out.println("Diagonal principal:");
for (int i = 0; i < 4; i++) {
System.out.println(matriz[i][i] + " ");
}

// Diagonal secundária (índice linha + coluna == tamanho - 1)
System.out.println("Diagonal secundária:");
for (int i = 0; i < 4; i++) {
System.out.println(matriz[i][3 - i] + " ");
}
}
}





