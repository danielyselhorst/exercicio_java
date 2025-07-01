public class VetorExercicio3 {

    public static void main(String[] args) {

int[] vetor = new int[10];
int menor = 0;
int maior = 0;

for(int i = 0; i < 10; i++){
    
    vetor[i] = (int)(Math.random() * 101);
}
maior = vetor[0];
menor = vetor[0];

for(int i = 0; i < 10; i++){

    if(maior > vetor[i]){
      maior = vetor[i]; 
    }

    if(menor < vetor[i]){
       menor = vetor[i]; 

    }
       
    }
    System.out.println("maior: "+maior+" | menor: "+menor);
    for(int i = 0; i < 10; i++){
    System.out.println(vetor[i]);
    
} 
      
    }

}
    

    
