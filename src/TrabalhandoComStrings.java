import java.util.Locale;

public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Paulo";
        String sobrenome = " Henrique";
        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(sobrenome);
        String nomeCompleto = nome.concat(sobrenome);


        System.out.println("Ola " +nome.toLowerCase(Locale.ROOT) + " seu nome tem " + tamanhoString + " caracteres.");
        System.out.println("Os nomes são iguais? " + saoIguais);
        System.out.println("Nome completo: " + nomeCompleto);
    }
}
