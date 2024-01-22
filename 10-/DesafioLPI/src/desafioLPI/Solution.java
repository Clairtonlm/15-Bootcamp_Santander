package desafioLPI;

public class Solution {
    public static void main(String[] args) {
        double[] dados1 = {1, 5.0, 2000.00};
        double novoSalario1 = calculoSalario(dados1);
        System.out.println("Novo Salário 1: " + novoSalario1);

        double[] dados2 = {11, 4.5, 2500.00};
        double novoSalario2 = calculoSalario(dados2);
        System.out.println("Novo Salário 2: " + novoSalario2);
    }

    public static double calculoSalario(double[] input) {
        int tempoDeServico = (int) input[0];
        double inflacao = input[1];
        double salarioAtual = input[2];

        double percentualTempoServico = 0.0;


        if (tempoDeServico >= 1 && tempoDeServico < 5) {
            percentualTempoServico = 1.0;
        } else if (tempoDeServico >= 5 && tempoDeServico < 10) {
            percentualTempoServico = 1.5;
        } else if (tempoDeServico >= 10) {
            percentualTempoServico = 2.0;
        }


        double novoSalario = salarioAtual * (1 + (percentualTempoServico / 100 + inflacao / 100));


        novoSalario = Math.round(novoSalario * 100.0) / 100.0;

        return novoSalario;
    }
}
