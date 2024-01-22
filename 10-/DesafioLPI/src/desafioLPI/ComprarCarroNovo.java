package desafioLPI;

public class ComprarCarroNovo {
    public static void main(String[] args) {
        double[] carro1 = {100000.00, 12000.00, 20000.00};
        double[] percentuais1 = custosCarro(carro1);
        System.out.println("Percentuais 1: [" + percentuais1[0] + ", " + percentuais1[1] + "]");

        double[] carro2 = {115500.00, 25000.00, 32500.00};
        double[] percentuais2 = custosCarro(carro2);
        System.out.println("Percentuais 2: [" + percentuais2[0] + ", " + percentuais2[1] + "]");
    }

    public static double[] custosCarro(double[] input) {
        double precoFinalFabrica = input[0];
        double custoDistribuidor = input[1];
        double precoImpostos = input[2];


        double percentualDistribuidor = (custoDistribuidor / precoFinalFabrica) * 100;


        double percentualImpostos = (precoImpostos / precoFinalFabrica) * 100;


        percentualDistribuidor = Math.round(percentualDistribuidor * 100.0) / 100.0;
        percentualImpostos = Math.round(percentualImpostos * 100.0) / 100.0;

        return new double[]{percentualDistribuidor, percentualImpostos};
    }
}
