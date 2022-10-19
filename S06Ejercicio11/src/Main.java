public class Main {
    public static void main(String[] args) {
        int notas;
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;
        for (int i = 0; i < 20; i++) {
            notas = (int) (Math.random() * 5);
            switch (notas) {
                case 0:
                    System.out.println("Suspenso");
                    suspenso++;
                    break;
                case 1:
                    System.out.println("Suficiente");
                    suficiente++;
                    break;
                case 2:
                    System.out.println("Bien");
                    bien++;
                    break;
                case 3:
                    System.out.println("Notable");
                    notable++;
                    break;
                case 4:
                    System.out.println("Sobresaliente");
                    sobresaliente++;
                    break;
                default:
            }
        }
        System.out.println("No. de Suspensos: "+suspenso);
        System.out.println("No. de Suficientes: "+suficiente);
        System.out.println("No. de Bienes: "+bien);
        System.out.println("No. de Notables: "+notable);
        System.out.println("No. de Sobresaliente: "+sobresaliente);
    }
}