import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int NumeroPrimo = scanner.nextInt();
        for (int i =3; i <= NumeroPrimo / 2; i+=2 ) {
            if (NumeroPrimo % i==0) {
                System.out.println("el numero no es primo");
                
            } else { System.out.println("el numero es primo");
               

            }
              
        } 
            
    }
       
}
