package principal;

public class Ternario {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("0 == " + i);
        System.out.println(i++ == 1 ? "1 == " + i : "1 != " + i);
    }
}
