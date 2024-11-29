public class TiendaYBanco {
    public static void main(String[] args) {
        
        
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;
        double descuento = 0.15;  
        double descuentoAdicional = 0.05;  

        
        double precioCamisetaDescuento = precioCamiseta * (1 - descuento);
        double precioPantalonDescuento = precioPantalon * (1 - descuento);
        double segundaCamisetaDescuento = precioCamisetaDescuento * (1 - descuentoAdicional);

        
        double totalPrendas = precioCamisetaDescuento + precioPantalonDescuento + segundaCamisetaDescuento;
        System.out.printf("Precio total de las prendas: $%.2f%n", totalPrendas);

        
        double dineroInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanas = 4;

        double totalRetirado = retiroSemanal * semanas;
        double dineroRestante = dineroInicial - totalRetirado;

        System.out.printf("Dinero restante en la cuenta:" + dineroRestante);
    }
}
