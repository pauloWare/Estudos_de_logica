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

        // boolean estaChovendo = true;

        // if (!estaChovendo) {
        //    System.out.println("Vamos sair para passear");
        //} else {
        //    System.out.println("Vamos ficar em casa");

       // boolean temDinheiro = true ;
        // boolean temCartao =  false;

        //  if (temDinheiro &&  temCartao){
        //     System.out.println("Pede um ifood e um zé delivery");
        //  } else if (temDinheiro ||  temCartao){
        //      System.out.println("pede ifood");
        //   } else {
        //     System.out.println("Não pede nada");
        //   }

        String mensagem = (idade >=18)?"Vocẽ é maior de idade":"Vocẽ é menor de idade";
        System.out.println(mensagem);
    }
}