package PrimeiroExercicio;

//import java.util.Scanner;

/*
* Calcule as 4 operações aritméticas. Depois exiba pela classe principal, main.
*
*
*
* */

public class Calculadora {

    /* Calculadora completa com inserção de dados pelo usuário
    import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor");
        a =  scan.nextInt();
        System.out.println("Digite o segundo valor");
        b =  scan.nextInt();

        int soma = soma(a, b);
        int subtracao = subtracao(a, b);
        int divisao = divisao(a, b);
        int multiplicacao = multiplicacao(a, b);

        System.out.println("A soma é " + soma);
        System.out.println("A subtração é " + subtracao);
        System.out.println("A multiplicação é " + multiplicacao);
        System.out.println("A divisão é " + divisao);


    }

    public static int soma (int a, int b) {
        return a + b;
    }

    public static int subtracao (int a, int b) {
        return a - b;
    }
    public static int divisao (int a,int  b) {
        return a / b;
    }
    public static int multiplicacao (int a,int  b) {
        return a * b;
    }

}
*/



    public static void soma (double a, double b) {
        double resultado =  a + b;

        System.out.println("A soma de " + a + " mais " + b + " é " + resultado );
    }
    public static void divisao (double a, double b) {
        double resultado =  a / b;

        System.out.println("A divisão de " + a + " por " + b + " é " + resultado );
    }
    public static void subtracao (double a, double b) {
        double resultado =  a - b;

        System.out.println("A subtração de " + a + " menos " + b + " é " + resultado );
    }
    public static void multiplicacao (double a, double b) {
        double resultado =  a * b;

        System.out.println("A multiplicação de " + a + " vezes " + b + " é " + resultado );
    }
}

