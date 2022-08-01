package OperadoresRelacionais;

/*
* Com if, exiba o nome do mês do ano de acordo com seu numero. Evite o efeito flecha.
* Faça também outro if que verifique se o mês é Julho, Dezembro ou Janeiro, para assim exibir o texto "férias"
*
* Com o switch use String a partir do dia da semana, exibir seu número.
* Faça um exemplo que se uma variável interira for entre 1 e 3 exibir texto "certo", se for 4, exibir "errado"
* se for 5 "talvez". Para demais valores exibir "Valor indefinido"
*
*
*
* */

public class TerceiroExercicio {
    public static void main(String[] args) {

        ifSemFlecha();
        ifFerias();

        DiaSemana();
        inteira();

    }


    private static void ifSemFlecha() {

        int mes = 10;


        if (mes == 1) {
            System.out.println("Janeiro");
        }else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes ==10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }
    }

    private static void ifFerias(){

        int mes2 = 11;


        if ((mes2 == 1) || (mes2 == 7) || (mes2 == 12)) {
            System.out.println("Férias");
        } else  {
            System.out.println(" Va trabalhar");
        }

    }

    private static void DiaSemana() {

        int dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("terca");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
        }
    }

    private static void inteira() {

        int i1 = 5;

        switch (i1){
            case 1:
            case 2:
            case 3:
                mensagemCerto();
                break;
            case 4:
                mensagemErrado();
                break;
            case 5:
                mensagemTalvez();
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

    public static void mensagemCerto() {
        System.out.println("Certo");
    }
    public static void mensagemErrado() {
        System.out.println("Errado");
    }
    public static void mensagemTalvez() {
        System.out.println("Talvez");
    }


}


