import java.util.Scanner;

public class VetorExercicio4 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
int[] valores = new int[6];

System.out.println("Digite 6 valores inteiros ");

   //ler o valor 
for (int i = 0; i < 6; i++){
    
    valores[i] = scanner.nextInt();
}

System.out.println("Valores lidos de maneira inversa: ");

for (int i = 5; i >= 0; i--){
System.out.println(valores[i]);
    }
       
    } 
}
    
 
      
    


    

    
