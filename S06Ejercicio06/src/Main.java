import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);

        int intentos = 5;
        int num_int;
        System.out.println("Estoy pensando un numero...");
        int num_sec = (int) (Math.random() * 101);
        do {
            System.out.print("Introduce un numero entre 0 y 100 para adivinar el numero secreto ");
            num_int = sc.nextInt();
            intentos--;
            if((intentos>0) && (num_int<num_sec)){
                System.out.println("El numero introducido es menor que el secreto");
                System.out.print("Te quedan "+intentos+" intentos");
            }
            if((intentos>0) && (num_int>num_sec)){
                System.out.println("EL numero introducido es mayor que el secreto ");
                System.out.println("Te quedan "+intentos+" intentos");
            }
            if(num_int==num_sec){
                correcto=true;
                System.out.println("Enhorabuena, has ganado, el numero secreto era "+num_sec);
            }
        }while(!correcto && (intentos > 0) );

        if(!correcto){
            System.out.println("Lo siento,has agotado los intentos, el numero secreto era "+num_sec);
        }
    }
}
