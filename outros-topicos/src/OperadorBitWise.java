public class OperadorBitWise {

    //Verificador de Bit a Bit onde:
    // & = operador "E"
    // | = operador "OU"
    // ^ = operador "OU EXCLUSIVO" (onde apenas quando uma for verdadeira, irá dar true)

    public static void main(String[] args) {

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

    }

}
