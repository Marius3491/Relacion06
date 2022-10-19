public class Main {
    public static void main(String[] args) {
        int notas = 4 * (int)(Math.random() * 7 + 1);
        String nota = "";
        String p_nota = "";
        for (int cont_nota = 1; cont_nota <= notas; cont_nota++) {
            switch((int)(Math.random() * 7)) {
                case 0:
                    nota = "do";
                    break;
                case 1:
                    nota = "re";
                    break;
                case 2:
                    nota = "mi";
                    break;
                case 3:
                    nota = "fa";
                    break;
                case 4:
                    nota = "sol";
                    break;
                case 5:
                    nota = "la";
                    break;
                case 6:
                    nota = "si";
                    break;
                default:
            }
            if (cont_nota == 1) {
                p_nota = nota;
            }
                if (cont_nota == notas) {
                nota = p_nota;
            }
            System.out.print(nota + " ");
            if ( cont_nota == notas ) {
                System.out.print("||");
            } else if ( cont_nota % 4 == 0 ) {
                System.out.print("| ");
            }
        }
    }
}