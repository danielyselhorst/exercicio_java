import java.util.Locale;
public class Programa{

    public static void main(String[] args){
        Locale.setDefault(new Locale("pt","BR"));

        /*Triangulo valido
        a + b > c
        a + c > b
        b + c > a
        */
        Triangulo triangulo1 = new Triangulo();
        triangulo1.ladoA = 10;
        triangulo1.ladoB = 15;
        triangulo1.ladoC = 20;

        Triangulo triangulo2 = new Triangulo();
        triangulo2.ladoA = 20;
        triangulo2.ladoB = 15;
        triangulo2.ladoC = 10;

        Triangulo triangulo3 = new Triangulo();
        triangulo2.ladoA = 20;
        triangulo2.ladoB = 15;
        triangulo2.ladoC = 10;

        double areaTriangulo1 = triangulo1.area();
        double areaTriangulo2 = triangulo2.area();
        double areaTriangulo3 = triangulo3.area();

        System.out.println("Area do triangulo 1: "+areaTriangulo1);
        System.out.println("Area do triangulo 2: "+areaTriangulo2);
        System.out.println("Area do triangulo 3: "+areaTriangulo3);


    }
}