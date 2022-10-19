public class Main {
    public static void main(String[] args) {
        int dado1 = (int) (Math.random() * 6 + 1 );
        int dado2 = (int) (Math.random() * 6 + 1 );
        int dado3 = (int) (Math.random() * 6 + 1 );
        System.out.println("Resultado del primer dado: "+dado1);
        System.out.println("Resultado del segundo dado: "+dado2);
        System.out.println("Resultado del tercer dado: "+dado3);
        int suma = dado1+dado2+dado3;
        System.out.println("Suma de "+dado1+", de "+dado2+" y de "+dado3+" es "+suma);
    }
}