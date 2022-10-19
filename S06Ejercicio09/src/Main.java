public class Main {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        do {
            numero = (int) (Math.random()*101);
            if (numero % 2 == 0){
                System.out.print(numero+" ");
                contador++;
        }
        }while(numero != 24) ;
        System.out.println("\nCantidad de numeros generados: "+contador);
    }
}