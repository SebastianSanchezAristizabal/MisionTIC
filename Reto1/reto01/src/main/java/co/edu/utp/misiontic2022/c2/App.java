package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /*Double valor = 1000000.0;
        Integer tiempo = 1;
        EvaluarCreditoVehiculo evaluar = new EvaluarCreditoVehiculo();
        String eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);*/

        Double valor = 300000.0;
        Integer tiempo = 12;
        EvaluarCreditoVehiculo evaluar = new EvaluarCreditoVehiculo();
        String eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);
    }
}
