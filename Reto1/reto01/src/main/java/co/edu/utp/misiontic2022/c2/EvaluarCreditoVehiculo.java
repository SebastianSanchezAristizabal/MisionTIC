package co.edu.utp.misiontic2022.c2;

public class EvaluarCreditoVehiculo
{    
    public String compararOpcion(Double valor, Integer tiempo) {
        Double interesSimple = calcularInteresSimple(valor, tiempo, 2.5);
        Double interesCompuesto = calcularInteresCompuesto(valor, tiempo, 2.2);
        String recomendacion = interesSimple <= interesCompuesto ? "credito especial" : "credito estandar";
        return recomendacion;
    }

    /*private Double calcularInteresCompuesto(Double valor, Integer tiempo, Double interes) {
        Double interesDecimal = interes / 100.0;
        Double auxiliar = Math.pow(1 + interesDecimal, tiempo);
        Double interesCompuesto = valor * (auxiliar - 1);
        return interesCompuesto;
    }*/

    private Double calcularInteresCompuesto(Double valor,Integer tiempo,Double interes) {
        Double interesDecimal = interes/100.0;
        double base = 1 + interesDecimal;
        double potencia = Math.pow(base,Double.valueOf(tiempo));
        return valor*(potencia-1);
    }

    private Double calcularInteresSimple(Double valor, Integer tiempo, Double interes) {
        Double interesDecimal = interes/100.0;
        Double interesSimple = valor * interesDecimal * tiempo;
        return interesSimple;
    }
}
