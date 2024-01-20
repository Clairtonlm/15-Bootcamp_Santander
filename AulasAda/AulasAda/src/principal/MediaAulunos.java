package principal;

public class MediaAulunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o números de alunos");
        int alunos = sc.nextInt();

        int[] vect = new int[alunos];
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite uma nota");
            vect[i] = sc.nextInt();
        }
    }


}