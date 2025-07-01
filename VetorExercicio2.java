
public class VetorExercicio2 {

    public static void main(String[] args) {

int[] vetor = new int[10];
int pares = 0;
int impares = 0;

System.out.println("Digite 10 valores inteiros ");
    

for(int i = 0; i < 10; i++){
    vetor[i] = (int)(Math.random() * 101);
}


for(int i = 0; i < 10; i++){
    
    if(vetor[i] % 2 == 0){
      pares++;  
    }else{
        impares++;
    }
    System.out.println("Valores pares: " +pares);
    System.out.println("Valoresimpares: " +impares);

   
      
    }


    }
}
    
