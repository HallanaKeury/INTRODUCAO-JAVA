package PrimeiroExercicio;

/*
* A partir da hora do dia, informe a mensagem adequada: Bom dia, boa tarde, boa madrugada.
* Depois exiba pela classe principal, main.
*
*
* */

public class Mensagem {
    public static void obterMensagem(int hora) {

        switch (hora){
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 01:
            case 02:
            case 03:
            case 04:
            case 05:
                mensagemBoaMadrugada();
                break;
            default:
                System.out.println("Hora inválida");
                break;
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom Dia");
    }
    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde");
    }
    public static void mensagemBoaMadrugada() {
        System.out.println("Boa Madrugada");
    }

}
