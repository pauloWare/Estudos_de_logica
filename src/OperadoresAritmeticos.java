public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 15.00;
        double desconto = 5.00;
         int totaldiasmes = 5;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalComDividido = valorTotal / 2;
        double valorTotalMensal = valorTotalComDesconto * totaldiasmes;

        System.out.println("valorTotal = R$" + valorTotalMensal);

    }

}
