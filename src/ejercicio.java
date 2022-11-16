public class ejercicio {

    public static void main(String[] args) {

        persona Persona1 = new persona();

        Persona1.setEdad(33);
        Persona1.setNombre("John");
        Persona1.setTelefono("30034345");

        System.out.println("Mi edad es "+Persona1.getEdad());
        System.out.println("Mi nombre es "+Persona1.getNombre());
        System.out.println("Mi telefono es "+ Persona1.getTelefono());


    }
}

class persona{

    private int edad;
    private String nombre;
    private String telefono;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
