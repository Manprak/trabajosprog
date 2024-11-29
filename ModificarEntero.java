public class ModificarEntero {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Antes de incrementar: " + x);
        x = incrementar(x);
        System.out.println("Después de incrementar: " + x);
    }

    public static int incrementar(int x) {
        x = x + 1;
        return x;
    }
}

