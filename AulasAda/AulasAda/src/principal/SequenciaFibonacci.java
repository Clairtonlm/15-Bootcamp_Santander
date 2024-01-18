package principal;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        imprimirSequenciaFibonacci(4);

        imprimirSequenciaFibonacci(0);

        imprimirSequenciaFibonacci(8);
    }

    public static void imprimirSequenciaFibonacci(int numero) {
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.print("Sequência Fibonacci até " + numero + ": ");

        while (primeiroTermo <= numero) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        System.out.println();
    }
}
