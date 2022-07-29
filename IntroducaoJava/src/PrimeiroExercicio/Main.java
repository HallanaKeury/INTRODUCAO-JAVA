package PrimeiroExercicio;

/*
* Classe principal a ser exibida os resultados.
* */

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora");

        Calculadora.soma(10, 3);
        Calculadora.subtracao(10, 3);
        Calculadora.divisao(10, 3);
        Calculadora.multiplicacao(10, 3);

        //Mensagem
        System.out.println("Exercício Mensagem");

        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(23);

        //Emprestimo
        System.out.println("Exercício Emprestimo");

        Emprestimo.calcular(350, 2);
        Emprestimo.calcular(350, 3);
        Emprestimo.calcular(350, 5);


    }






}
