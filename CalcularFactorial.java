import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero no negativo para calcular su factorial:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1; 
            int i = numero; 

            while (i > 0) {
                factorial *= i;
                i--;
            }

        
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

    }
}
