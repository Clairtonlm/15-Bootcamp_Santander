package principal;

public class ExemploEmum {

        // Declarando um enum chamado DiaDaSemana
        public enum DiaDaSemana {
            DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
        }

        public static void main(String[] args) {
            // Atribuindo um valor do enum a uma variável
            DiaDaSemana dia = DiaDaSemana.SEXTA;

            // Usando um switch para lidar com valores enum
            switch (dia) {
                case DOMINGO:
                    System.out.println("Hoje é domingo!");
                    break;
                case SEGUNDA:
                    System.out.println("Segunda-feira, dia de trabalho.");
                    break;
                case SEXTA:
                    System.out.println("Sextou!");
                    break;
                default:
                    System.out.println("Outro dia da semana.");
            }
        }


}
