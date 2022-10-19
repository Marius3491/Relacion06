public class Main {
    public static void main(String[] args) {
        String palo="";
        String carta="";
        int opcion_n= (int) (Math.random()*13)+1;
        int opcion_p = (int) (Math.random() * 4)+1;
        switch(opcion_p){
            case 1:
                palo="Picas";
                break;
            case 2:
                palo="Corazones";
                break;
            case 3:
                palo="Diamantes";
                break;
            case 4:
                palo="Treboles";
            default:
        }

        switch(opcion_n){
            case 1:
                carta="A";
                break;
            case 11:
                carta="J";
                break;
            case 12:
                carta="Q";
                break;
            case 13:
                carta="K";
                break;
            default:
                carta = String.valueOf(opcion_n);
        }
        System.out.println("Muestro el "+carta+" de "+palo);
    }
}