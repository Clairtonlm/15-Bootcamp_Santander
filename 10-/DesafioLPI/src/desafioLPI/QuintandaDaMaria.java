package desafioLPI;

public class QuintandaDaMaria {
    public static void main(String[] args) {
        int quantidade1 = 2;
        double custo1 = custoCompra(quantidade1);
        System.out.println("Custo 1: " + custo1);

        int quantidade2 = 12;
        double custo2 = custoCompra(quantidade2);
        System.out.println("Custo 2: " + custo2);
    }

    public static double custoCompra(double quantidade) {
        double precoUnitario;

        if (quantidade >= 10) {
            precoUnitario = 1.25;
        } else {
            precoUnitario = 1.45;
        }

        double custoTotal = quantidade * precoUnitario;


        custoTotal = Math.round(custoTotal * 100.0) / 100.0;

        return custoTotal;
    }
}
