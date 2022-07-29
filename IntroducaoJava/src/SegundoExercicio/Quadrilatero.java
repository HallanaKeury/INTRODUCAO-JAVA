package SegundoExercicio;

/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos.
 */

public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    /*
    * Para calcular a área de um trapézio basta somar a base maior e base menor,
    * multiplicar pela altura e depois, basta dividir o resultado por dois.
    * */
    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    /*
    * A única maneira de calcular a área de um losango é
    * multiplicando suas diagonais e dividindo o resultado por 2.
    * */
    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }

}




