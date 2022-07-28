package variaveis;

/*
*Testando formas de lançar as variáveis, entendendo as corretas
*
* */

public class TestandoVariaveis {

    public static void main(String[] args) {

        int i;
        // int i; as variáveis não podem ter nomes iguais
        int I;
        // int 1f;  Não podem começar com números
        int _la; //Não é uma boa prática, mas não dá erro de compilação

        i = 5;
        I = 2;
        _la = 3;

        final int j = 10; // Não vai ter alteração, é uma variável constante
        //j =15;  Não é permitido, o final não se altera
        int EssaEstaCerta = 10;
        //int sgt*&& = 1; Caracteres não são permitidos


        System.out.println(i);
        System.out.println(I);
        System.out.println(_la);
        System.out.println(j);
        System.out.println(EssaEstaCerta);







    }
}
