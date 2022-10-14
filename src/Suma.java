public class Suma {
    public static void main(String[] args) {
        int resultado = sumar(4, 10, 40);

        System.out.println(resultado);

        Coche MiChoche = new Coche();
        MiChoche.sumarPuertas();

        System.out.println(MiChoche.puertas);
    }

    public static int sumar(int a, int b, int c) {
        return a+b+c;
    }

static class Coche {
    public int puertas = 0;

    public void sumarPuertas() {
        this.puertas++;
    }
}

}