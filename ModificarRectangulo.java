
class Rectangulo {
    int ancho;
    int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void mostrarDimensiones() {
        System.out.println("Ancho: " + this.ancho + ", Alto: " + this.alto);
    }
}

public class ModificarRectangulo {
    
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 5);

        System.out.println("Antes de modificar:");
        rectangulo.mostrarDimensiones();

        modificarRectangulo(rectangulo);

        System.out.println("Después de modificar:");
        rectangulo.mostrarDimensiones();
    }

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 20;
        r.alto = 10;
    }
}
