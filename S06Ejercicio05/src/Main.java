public class Main {
    public static void main(String[] args) {
        int min = 100;
        int max = 199;
        int n;
        int suma = 0;
        for(int i = 0;i<50;i++){
            n = (int) (Math.random()*100)+100;
            System.out.print(n+" ");
            suma = n + suma;
            if(n < min){
                min = n;
            }
            if(n > max){
                max = n;
            }

        }
        System.out.println(" ");
        System.out.println("Min: "+min+". Max: "+max+" Media: "+(suma/50));
    }
}