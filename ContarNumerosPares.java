public class ContarNumerosPares {
    public static void main(String[] args) {
        int contador = 0; 
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { 
                contador++;
            }
        }

        System.out.println("La cantidad de números pares entre 1 y 100 es: " + contador);
    }
}
