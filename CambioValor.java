public class CambioValor {
    
    public static void main(String[] args) {
        int numero = 10; 

        System.out.println("Antes de llamar al método: " + numero);
    
        cambiarValor(numero);

        System.out.println("Después de llamar al método: " + numero);
    }

    public static void cambiarValor(int num) {
        num = 20; 
        System.out.println("Dentro del método, el valor de num es: " + num);
    }
}
