public class MatrizExercicio4 {
public static void main(String[] args) {

char[][] matriz = new char[4][4];

// Preencher matriz
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
matriz[i][j] = '*';
}
}

// a) Exibir matriz
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
System.out.print("\t" + matriz[i][j]);
}
System.out.println();
}

// b) Somente as bordas
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
if (i == 0 || i == 3 || j == 0 || j == 3) {
System.out.print("\t" + matriz[i][j]);
} else {
System.out.print("\t ");
}
}
System.out.println();
}

// c) Triângulo inferior
for (int i = 0; i < 4; i++) {
for (int j = 0; j < i; j++) {
System.out.print("\t" + matriz[i][j]);
}
System.out.println();
}
}
}
