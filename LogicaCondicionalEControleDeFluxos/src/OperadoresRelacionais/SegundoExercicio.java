package OperadoresRelacionais;

public class SegundoExercicio {

    public static void main(String[] args) {


        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int i1 = 2;
        int i2 = 4;
        float f1 = 3f;
        float f2 = 5.5f;


        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println("!b1   " + (!b1));
        System.out.println("!b2 " + (!b2) );

        // Validação da soma através da condicional &&(and), o resultado vai ser booleano(false)
        System.out.println("O resultado de (i1 + i2) < (f2 - f1) && true  é :" + ((i1 + i2) < (f2 - f1) && true) );
        System.out.println("O resultado de (i1 + i2) < (f2 - f1) || true  é :" + ((i1 + i2) < (f2 - f1) || true) );


        //Condição aplicada para saber se a pessoa pode receber um benefício. Se tiver as
        // exigências de estar abaixo da média salarial, e a mesma quantidade de dependentes da média ou acima.

         double salarioMensal = 1150.00;
         double mediaSalario  = 1200.00;

         int quantidadeDependentes = 4;
         int mediaDependentes = 2;

         System.out.println("(salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)");
         System.out.println("O resultado é "+ ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)));





    }
}
