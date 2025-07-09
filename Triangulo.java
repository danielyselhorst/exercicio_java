public class Triangulo{
    
    //Atributos(caracteristicas e campos/variaveis)
    double ladoA;
    double ladoB;
    double ladoC;

    //metodos(ação e comportamentos)
    public double area(){
        double p = (ladoA + ladoB + ladoC) / 2.0;
        double area = Math.sqrt(p * (p - ladoA)*(p - ladoB)*(p - ladoC));
        return area;
    }

}
