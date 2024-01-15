package principal;

import java.util.Scanner;

public class UsandoArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um number inteiro");

        int var1=sc.nextInt();
       String resultado = var1 % 2 == 0 ? " Par" : "Impar";
        System.out.println("O número digitado foi " + var1 + " é " + resultado);

       sc.close();
    }
}
