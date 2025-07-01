public class VetorExercicio6 {
public static void main(String[] args) {

int[] vetorA = new int[10];
int[] vetorB = new int[10];
int[] vetorC = new int[10];

for (int i = 0; i < 10; i++) {
vetorA[i] = (int)(Math.random() * 101);
vetorB[i] = (int)(Math.random() * 101);

vetorC[i] = vetorA[i] - vetorB[i];

}

System.out.println("A\t|\tB\t|\tC");
for (int i = 0; i < 10; i++) {
System.out.println(vetorA[i] + "\t|\t"+vetorB[i]+"\t|\t"+vetorC[i]);
}

}   
}