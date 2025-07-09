public class Produto{
    
    //Atributos(caracteristicas e campos/variaveis)
    public String nome;
    public double preco;
    public int quantidade;

    //metodos(ação e comportamentos)
    public String mensagem(){
        String mensagem = "Produto: "+nome+", R$"+preco+", "+quantidade+"unidades, total: "+(preco * quantidade);
        return mensagem;
    }

    public double TotalValorEmEstoque(){
        return preco * quantidade;
    }

    public void AdicionarProduto(int qtde){
       quantidade += qtde;
    }

    public void RemoverProduto(int qtde){//void nao terna nada para a função principal
        quantidade -= qtde;
    }

}
