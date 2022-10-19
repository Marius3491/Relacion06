public class Main {
    public static void main(String[] args) {
        String palo="";
        String carta="";
        int opcion_n= (int) (Math.random()*7)+1;
        int opcion_p = (int) (Math.random() * 4)+1;
        switch(opcion_p){
            case 1:
                palo="Copas";
                break;
            case 2:
                palo="Bastos";
                break;
            case 3:
                palo="Espadas";
                break;
            case 4:
                palo="Oros";
            default:
        }

        switch(opcion_n){
            case 1:
                carta="As";
                break;
            case 10:
                carta="Sota";
                break;
            case 11:
                carta="Caballo";
                break;
            case 13:
                carta="Rey";
                break;
            default:
                carta = String.valueOf(opcion_n);
        }
        System.out.println("Muestro el "+carta+" de "+palo);
    }
}