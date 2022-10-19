import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intento = 5;
        int num;
        int minimo = 0;
        int maximo = 100;
        boolean acierto = false;
        int opcion;

        System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");

        do {
            num = (int)(Math.random() * (maximo - minimo) + minimo);
            System.out.println("Es el " + num + "?");
            System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
            opcion = sc.nextInt();
            intento--;

            if ( (opcion == 1) && (intento > 0) )
                minimo = num + 1;

            if ( (opcion == 2) && (intento > 0) )
                maximo = num - 1;

            if (opcion == 3) {
                acierto = true;
                System.out.println("Acerte el numero");
            }
        } while(!acierto && (intento > 0));

        if (!acierto) {
            System.out.println("No lo he conseguido acertar");
        }

    }
}