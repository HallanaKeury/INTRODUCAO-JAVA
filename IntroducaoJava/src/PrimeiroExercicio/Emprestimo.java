package PrimeiroExercicio;

/*
* Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.
* Defina arbitrariamente as faixas que influenciam nos valores.
* Depois exiba pela classe principal, main.
*
*
* */

public class Emprestimo {
    public static int getDuasParcelas() {
        return 2;
    }
    public static int getTresParcelas() {
        return 3;
    }
    public static double getTaxasDuasParcelas() {
        return 0.3;
    }
    public static double getTaxasTresParcelas() {
        return 0.8;
    }

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxasDuasParcelas());
            System.out.println("Valor final do empréstimo para duas parcelas é " + valorFinal);

        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxasTresParcelas());
            System.out.println("Valor final do empréstimo para três parcelas é " + valorFinal);

        }else {
            System.out.println("Quantidade de parcelas não aceita");
        }


    }

}
