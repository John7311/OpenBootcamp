public class condicionales {

    public static void main(String[] args) {

    int numeroIf = 5;

    if(numeroIf > 0) {
        System.out.println("El numero " + numeroIf + " es positivo\n");
    }if (numeroIf == 0) {
        System.out.println("El numero " + numeroIf + " no es positivo, ni negativo\n");
    }else {
        System.out.println("El numero " + numeroIf + " es negativo\n");
        }

    int numeroWhile = 0;

    while (numeroWhile < 3){
        numeroWhile += 1;
        System.out.println(numeroWhile);
        }

    do {
        System.out.println("\n"+numeroWhile+"\n");
        numeroWhile += 3;
    }while (numeroWhile<3);

    int numeroFor;

    for (numeroFor = 0; numeroFor <=3; numeroFor++){
        System.out.println(numeroFor);
    }

    String estacion = "verano";

    switch (estacion){
        case "verano":
            System.out.println("\n"+"La estacion actual es " +estacion);
            break;
        case "invierno":
            System.out.println("\n"+"La estacion actual es " +estacion);
            break;
        case "primavera":
            System.out.println("\n"+"La estacion actual es " +estacion);
            break;
        case "otoño":
            System.out.println("\n"+"La estacion actual es " +estacion);
            break;
        default:
            System.out.println("\n"+estacion + " no se considera una estación");

    }

    }
}
