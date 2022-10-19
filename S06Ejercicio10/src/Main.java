public class Main {
    public static void main(String[] args) {
        int longitud;
        int r;
        String fill="";


            for (int i = 1; i <= 10; i++) {
                longitud = (int) (Math.random() * 40) + 1;
                r = (int) (Math.random() * 6) + 1;
                switch (r) {
                    case 1:
                        fill="*";
                        break;
                    case 2:
                        fill="-";
                        break;
                    case 3:
                        fill="=";
                        break;
                    case 4:
                        fill=".";
                        break;
                    case 5:
                        fill="|";
                        break;
                    case 6:
                        fill="@";
                        break;
                    default:
                }
                for (int linea = 1; linea <= longitud; linea++) {
                    System.out.print(fill);
            }
            System.out.println();
        }
    }
}