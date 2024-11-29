public class pasoporvalor1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        intercambiar(a, b);
        System.out.println("despues de llamar a intercambiar " + a +" "+ b);
    }
        public static void intercambiar (int c, int d) {
            c = 6;
            d = 9;
            System.out.println("dentro del cambio de valor "+ c +""+ d);
        }

     
}
