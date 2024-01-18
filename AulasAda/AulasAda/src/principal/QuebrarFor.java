package principal;
/*
* O rótulo externo: é utilizado com o break para interromper o loop externo quando a condição j == 3 é atendida no loop interno.
* */
import com.sun.tools.javac.Main;

public class QuebrarFor {
    public static void main(String[] args) {
        externo: for(int i = 0; i < 10; i++){
            for( int j = 0; j < 10; j++){
                System.out.printf("(%d , %d)", i, j);
                if(j == 3){
                    break;
                }
            }
        }
    }
}
