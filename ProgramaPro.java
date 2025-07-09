import java.util.Scanner;
public class ProgramaPro{

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        //Instanncia a classe produto
        Produto produto1 = new Produto();

        //Cadrasta o produto 1
        System.out.println("Digite os dados do produto: ");
        System.out.println("Nome: ");
        produto1.nome =scanner.nextLine();
        System.out.println("preco: ");
        produto1.preco =scanner.nextDouble();
        System.out.println("Quantidade em estoque: ");
        produto1.quantidade =scanner.nextInt();

        //Mostrar mensagem
        System.out.println(produto1.mensagem());

        System.out.println("Entre com o numero de produtos para add no estoque: ");
        int estoque = scanner.nextInt();
        
        produto1.RemoverProduto(estoque);

        //Mostra mesagem  
        System.out.println(produto1.mensagem());

        System.out.println("Entre com o numero de produtos para add no estoque: ");
      estoque = scanner.nextInt();
        produto1.RemoverProduto(estoque);
        

        //Mostra mesagem
        System.out.println(produto1.mensagem());

        scanner.close();

    }
}