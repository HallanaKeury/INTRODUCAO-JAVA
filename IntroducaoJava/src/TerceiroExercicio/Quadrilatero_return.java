package TerceiroExercicio;
/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos.
 */
public class Quadrilatero_return {
    public static double area(double lado) {

        return lado * lado;
    }
    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }
    /*
     * Para calcular a área de um trapézio basta somar a base maior e base menor,
     * multiplicar pela altura e depois, basta dividir o resultado por dois.
     * */
    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior+baseMenor)*altura) / 2;
    }



}




