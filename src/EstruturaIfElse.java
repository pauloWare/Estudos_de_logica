import java.util.Scanner;

public class EstruturaIfElse {
    public static void main(String[] args) {

        int idade = 16;

        //  if (idade >=18){
        //        System.out.println("Vocẽ é maior de idade");
        //   }
        //    else {
        //    System.out.println("Vocẽ é menor de idade");
        //    }

        //  Scanner scanner = new Scanner(System.in);
        //   System.out.println("Digite sua idade: ");

        boolean estaChovendo = true;

        if (!estaChovendo) {
            System.out.println("Vamos sair para passear");
        } else {
            System.out.println("Vamos ficar em casa");
        }
    }
}