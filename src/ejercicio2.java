public class ejercicio2 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.edad = 29;
        cliente1.nombre = "Maria";
        cliente1.telefono = "48976547";
        cliente1.credito = true;

        System.out.println("Nombre del cliente: "+cliente1.nombre);
        System.out.println("Edad del cliente: "+cliente1.edad);
        System.out.println("Telefono del cliente: "+cliente1.telefono);
        System.out.println("Posee credito: "+cliente1.credito);

        Trabajador trabajador1 = new Trabajador();

        trabajador1.edad = 35;
        trabajador1.nombre = "José Maria";
        trabajador1.telefono = "3477364";
        trabajador1.salario = 1000;

        System.out.println("\nTrabajador: "+trabajador1.nombre);
        System.out.println("Edad : "+trabajador1.edad);
        System.out.println("Telefono : "+trabajador1.telefono);
        System.out.println("Salario : "+trabajador1.salario);

    }
}

class Personas{

    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Personas{
    boolean credito;
}

class Trabajador extends Personas{

    int salario;
}

