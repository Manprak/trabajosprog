class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }
}

public class ReasignacionReferencia {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");

        System.out.println("Antes de modificar:");
        persona.mostrarNombre();

        reasignarReferencia(persona);

        System.out.println("Después de reasignar referencia:");
        persona.mostrarNombre();
    }

    public static void reasignarReferencia(Persona p) {
        p = new Persona("Carlos");
        System.out.println("Dentro del método, el nuevo nombre es: " + p.nombre);
    }
}

