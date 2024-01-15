package principal;

import java.util.Scanner;

public class AulaEntradaDeDadosScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int primeiroNumero = obterSoma(entrada);

        int segundoNumero = obterSoma(entrada);

        int soma = primeiroNumero + segundoNumero;

        System.out.println("A soma dos números " + soma);
    }
    // metodo estatico

    static int obterSoma(Scanner sc){
        int numero;
        System.out.println("Digite um numero positivo");
        numero = sc.nextInt();
        if (numero < 0){
            System.out.println("O número digitado não é um número positivo, digite novamente.");
            numero = obterSoma(sc);

        }
        return numero;
    }
}
