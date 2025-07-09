public class Retangulo{
    
    //Atributos(caracteristicas e campos/variaveis)
    public double altura;
    public double largura;


    //metodos(ação e comportamentos)
    public double area(){
        double area = (altura * largura);
        return area;
    }
    public double perimetro(){
        double p = 2 * (altura * largura);
        return p;

    }
     public double diagonal(){
        double d = Math.sqrt(altura * altura + largura * largura);
        return d;
     }
     public void mensagem(){
        System.out.println("Area: "+area());
        System.out.println("Perimetro: "+perimetro());
        System.out.println("Diagonal: "+diagonal());

     }
}
 