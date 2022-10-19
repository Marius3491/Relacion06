public class Main {
    public static void main(String[] args) {
        int resultado;
        int columnas = 3;

        for (int fila = 1; fila <= 14; fila++) {
            System.out.printf(""+fila+". |", fila);

            for (int apuesta = 1; apuesta <= columnas; apuesta++) {
                resultado = (int)(Math.random() * 6) + 1;
                switch(resultado) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.print(" 1 |");
                        break;
                    case 4:
                    case 5:
                        System.out.print(" X |");
                        break;
                    case 6:
                        System.out.print(" 2 |");
                    default:
                }
            }
            System.out.println();
        }


        System.out.print("\nPLENO AL 15 - Local...");
        int goles = (int)(Math.random() * 4);
        if(goles < 3){
            System.out.print("M");
        }else{
            System.out.print(goles);
        }


        System.out.print("   Visitante...");
        goles = (int)(Math.random() * 4);
        if(goles < 3){
            System.out.print("M");
        }else{
            System.out.println(goles);
        }
    }
}