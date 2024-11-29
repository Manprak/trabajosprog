public class IntercambiarValores {

    public static void main(String[] args) {
      
        int a = 5;
        int b = 10;

        System.out.println("Antes de llamar al método:");
        System.out.println("a = " + a + ", b = " + b);

       
        intercambiar(a, b);

        System.out.println("Después de llamar al método:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Dentro del método:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
