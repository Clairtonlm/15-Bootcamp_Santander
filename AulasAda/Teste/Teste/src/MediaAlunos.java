package aula;
/*
 * * Calcular a média de notas de uma turma com n alunos. O valor n deve ser solicitado via System.in.
 * <p>
 * Deve-se criar um vetor para armazenar a nota de todos os alunos.
 * <p>
 * Ao final o programa deve imprimir a nota média e também a quantidade de alunos.
 * <p>
 * Obs.: Utilize um for para obter as notas de cada aluno e um foreach para fazer o cálculo da média
 */

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o números de alunos");
        int alunos = sc.nextInt();

        int[] vect = new int[alunos];
        for(int i = 0; i < alunos; i++){
            System.out.println("Digite uma nota");
            vect[i]= sc.nextInt();
        }
    }
    
}