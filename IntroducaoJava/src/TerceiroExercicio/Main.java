package TerceiroExercicio;


public class Main {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero_return.area(3);
        System.out.println("A área do quadrado é " + areaQuadrado);

        double areaRetangulo = Quadrilatero_return.area(5d,5d);
        System.out.println("A área do retangulo é " + areaRetangulo);

        double areaTrapezio = Quadrilatero_return.area(7,8,9);
        System.out.println("A área do trapézio é " + areaTrapezio);

    }
}
