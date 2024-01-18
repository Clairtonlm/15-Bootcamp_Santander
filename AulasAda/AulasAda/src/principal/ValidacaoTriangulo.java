package principal;

public class ValidacaoTriangulo {
    public static void main(String[] args) {
        int[] valores1 = {2, 2, 5};
        System.out.println(validarTriangulo(valores1));

        int[] valores2 = {3, 3, 5};
        System.out.println(validarTriangulo(valores2));
    }

    public static boolean validarTriangulo(int[] lados) {

        if (lados.length != 3) {
            System.out.println("Um triângulo deve ter exatamente três lados.");
            return false;
        }


        if ((lados[0] + lados[1] > lados[2]) && (lados[0] + lados[2] > lados[1]) && (lados[1] + lados[2] > lados[0])) {
            return true;
        } else {
            return false;
        }
    }
}
