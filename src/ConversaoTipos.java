public class ConversaoTipos {
    public static void main(String[] args) {

        // automatico porque double>int
       int numero = 10;
       double d = numero;
       //termino

       // não é automatico porque int<double
       double d2 = 10.5;
       int int2 = (int) d2;
        //termino

        // interger pra string
        Integer numeroInteger = 10;
        String numeroIntegerString = numeroInteger.toString();
        //termino



        // string para integer
        String numeroStringDois = "1234";
        Integer numeroConveretido = Integer.parseInt(numeroStringDois);
        //fim

        System.out.println(d);
        System.out.println(int2);
        System.out.println( numeroInteger + " " +numeroIntegerString );
        System.out.println( numeroStringDois + " " + numeroConveretido);






    }
}
