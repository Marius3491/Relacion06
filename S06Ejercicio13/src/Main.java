public class Main {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        do {
            dado1 = (int)(Math.random()*6+1);
            dado2 = (int)(Math.random()*6+1);
            System.out.println("Tirada primer dado: " + dado1);
            System.out.println("Tirada segundo dado: " + dado2);
            System.out.println("-----------------------------");
        }while (dado1 != dado2) ;
    }
}