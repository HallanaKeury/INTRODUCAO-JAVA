package variaveis;

public class TiposDeDados {
    public static void main(String[] args) {

        Byte b1 = 10;
        Byte b2 = 20;

        Short s1 = 20000;
        //Short s2 = 40000;  -32.768 ate 32.767 bits

        //int Exemplo1 = 82101885865843200000; suporta até  32 bits
        int Exemplo2 = 2400;

        //long l1 = 12000000000000000000000; suporta até 64 bits
        long l2 = 23400; // suporta até 64 bits

        float f1 = 4.5F;  //Tem que definir que é float com F
        //float f2 = 34567.75432112  suporta até  32 bits

        //double d1 = 23342.4356765325; suporta até 64 bits
        double d2 = 2.6;

        char c1 = 'T';  //somente um caractere

        boolean f2 = true; // por padrão é definido false


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(Exemplo2);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(f2);






    }
}
