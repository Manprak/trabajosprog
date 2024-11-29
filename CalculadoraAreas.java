import java.util.Scanner;

abstract class Poligono {
    protected String tipo;
    
    public Poligono(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double calcularArea();
}

class Triangulo extends Poligono {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Cuadrado extends Poligono {
    private double lado;
    
    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Rectangulo extends Poligono {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return base * altura;
    }
}

public class CalculadoraAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de polígono:");
        String tipoPoligono = scanner.nextLine().trim();
        
        while (!tipoPoligono.equals("Triángulo") && !tipoPoligono.equals("Cuadrado")
                && !tipoPoligono.equals("Rectángulo")) {
            System.out.println("Tipo inválido. Intente nuevamente.");
            tipoPoligono = scanner.nextLine().trim();
        }
        
        System.out.println("Ingrese la primera dimensión:");
        double dimension1 = scanner.nextDouble();
        
        System.out.println("Ingrese la segunda dimensión:");
        double dimension2 = scanner.nextDouble();
        
        Poligono poligono = null;
        
        switch (tipoPoligono.charAt(0)) {
            case 'T':
            case 't':
                poligono = new Triangulo(dimension1, dimension2);
                break;
            case 'C':
            case 'c':
                poligono = new Cuadrado(dimension1);
                break;
            case 'R':
            case 'r':
                poligono = new Rectangulo(dimension1, dimension2);
                break;
        }
        
        double area = poligono.calcularArea();
        
        System.out.println("El área del " + poligono.tipo + " es: " + area);
    }
}
