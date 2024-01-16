package principal;

import java.util.Scanner;

public class AulaEntradaDeDadosScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1 = obterSoma(entrada);
        int numero2 = obterSoma(entrada);

        //int soma = numero1 + numero2;

       //System.out.println("A soma dos números " + soma);


        // Lê Operação
        System.out.println("Digite a operação (+, -, *, /):");
        String operacao = entrada.next();


        int resultado = operacaoMatematica(numero1, numero2, operacao);
        System.out.println("Resultado da operação: " + resultado);
    }
    // metodo estatico

    static int obterSoma(Scanner sc) {
        int numero;
        System.out.println("Digite um numero positivo");
        numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("O número digitado não é um número positivo, digite novamente.");
            numero = obterSoma(sc);
        }
        return numero;
    }

    private static int operacaoMatematica(int numero1, int numero2, String operacao) {
                switch (operacao) {
                case "+":
                    return numero1 + numero2;
                case "-":
                    return numero1 - numero2;
                case "*":
                    return numero1 * numero2;
                case "/":
                    if (numero2 != 0) {
                        return numero1 / numero2;
                    } else {
                        System.out.println("Divisão por zero não é permitida.");
                        return 0;
                    }
                default:
                    System.out.println("Operação inválida");
                    return 0;
            }
        }
    }


