import java.util.Scanner;

public class CalculadoraConMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");

        
        int opcion = scanner.nextInt();

        
        double numero1, numero2, resultado;

        switch (opcion) {
            case 1: 
                System.out.println("Introduce el primer número:");
                numero1 = scanner.nextDouble();
                System.out.println("Introduce el segundo número:");
                numero2 = scanner.nextDouble();
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case 2: 
                System.out.println("Introduce el primer número:");
                numero1 = scanner.nextDouble();
                System.out.println("Introduce el segundo número:");
                numero2 = scanner.nextDouble();
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case 3: 
                System.out.println("Introduce el primer número:");
                numero1 = scanner.nextDouble();
                System.out.println("Introduce el segundo número:");
                numero2 = scanner.nextDouble();
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;

            case 4: 
                System.out.println("Introduce el primer número:");
                numero1 = scanner.nextDouble();
                System.out.println("Introduce el segundo número:");
                numero2 = scanner.nextDouble();
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;

            case 0: 
                System.out.println("Saliendo del programa.");
                break;

            default: 
                System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");
                break;
        }

    }
}

