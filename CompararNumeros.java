import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Introduce el tercer número:");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 < numero3) {
            System.out.println("El primer número es mayor que el segundo y menor que el tercero.");
        } else {
            System.out.println("El primer número NO es mayor que el segundo y menor que el tercero.");
        }
    }
    
}

