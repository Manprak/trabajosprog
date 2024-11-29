class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }
}

public class PasoPorReferencia {
    
    public static void main(String[] args) {    
        Persona persona = new Persona("Juan");

        System.out.println("Antes de modificar:");
        persona.mostrarNombre();

        modificarNombre(persona);

        System.out.println("Después de modificar:");
        persona.mostrarNombre();
    }

    public static void modificarNombre(Persona p) {
        p.nombre = "Carlos";
    }
}
