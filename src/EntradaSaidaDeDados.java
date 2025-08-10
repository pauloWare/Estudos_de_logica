import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {
       // System.out.println("Olá eu faço impressao e pulo a linha");
       // System.out.print("Olá eu faço impressao na mesma linha ");
       // System.out.printf("Olá eu faço a impressao formatada");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " +nome);

        System.out.println("Digite sua idade");
         int idade = scanner.nextInt();
        System.out.println("Idade: " +idade);

        System.out.println("Digite se voce esta empregado, sim ou nao");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Ola sou: " + nome + " tenho " + idade + " empregado?" + empregado);

    }
}
