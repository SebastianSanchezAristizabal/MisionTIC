package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        // CalcularPrecio();
        // formatearNumeros();
        // convertirVelocidad();
        // calcularHipotenusa();
        // verificarMultiplo10();
        // verificarMayúscula();
        // dividir();
        // extrearMayor();
        // validarHora();
        // validarFecha();
        // ciclar();
        // convertirDivisa();
        //escribirSerieFibonacci();
        //calcularFactorial();
        //imprimerSecuenciaAlfabetica();
        formatearContador();
    }

    /**
     * Despliega un mensaje y lee el teclado
     * 
     * @param mensaje Texto a mostrar
     * @return Texto leído
     */
    public static String leerTeclado(String mensaje) {
        System.out.printf("%s \n", mensaje);
        Scanner sc = null;
        sc = new Scanner(System.in);
        String lectura = sc.next();
        // sc.close();
        return lectura;
    }

    /*
     * Programa que calcule el precio de venta de un producto conociendo el precio
     * por unidad (sin IVA) del producto, el número de productos vendidos y el
     * porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.
     */
    public static void CalcularPrecio() {
        float precioUnidad = 0.0F;
        int productosVendidos = 0;
        float IVA = 0;
        String auxiliar;

        auxiliar = leerTeclado("Entre precio por unidad del producto: \r\n");

        precioUnidad = Float.valueOf(auxiliar);
        auxiliar = leerTeclado("Entre los productos vendidos: \n");
        productosVendidos = Integer.valueOf(auxiliar);
        auxiliar = leerTeclado("Entre el IVA en porcentaje: \n");
        IVA = Integer.valueOf(auxiliar);

        float precioVenta = precioUnidad * productosVendidos;
        precioVenta += precioVenta * IVA / 100;

        System.out.printf("El precio de venta total es %f", precioVenta);
    }

    /*
     * Programa que lea dos variables enteras N y m y le quite a N sus m últimas
     * cifras. Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234
     */
    public static void formatearNumeros() {
        String auxiliar;
        auxiliar = leerTeclado("Entre numero a formatear: ");
        int numero = Integer.valueOf(auxiliar);
        auxiliar = leerTeclado("Entre número de cifras quitar: ");
        int cifras = Integer.valueOf(auxiliar);

        for (int i = 1; i <= cifras; i++) {
            numero /= 10;
        }

        System.out.println("El número formateado es: " + numero);
    }

    /*
     * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
     * teclado
     */
    public static void convertirVelocidad() {
        String auxiliar;
        auxiliar = leerTeclado("Entre velocidad en Km/h: ");
        float velocidad = Float.valueOf(auxiliar);

        float velocidadConvertida = velocidad * 1000 / 3600;
        System.out.println("La velocidad en m/s es: " + velocidadConvertida);
    }

    /*
     * Programa que lea la longitud de los catetos de un triángulo rectángulo y
     * calcule la longitud de la hipotenusa según el teorema de Pitágoras
     */
    public static void calcularHipotenusa() {
        String auxiliar;
        auxiliar = leerTeclado("Entre cateto 1: ");
        float cateto1 = Float.valueOf(auxiliar);
        auxiliar = leerTeclado("Entre cateto 2: ");
        float cateto2 = Float.valueOf(auxiliar);

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa es: " + hipotenusa);
    }

    /*
     * Programa que lea un número entero y muestre si el número es múltiplo de 10
     */
    public static void verificarMultiplo10() {
        String auxiliar;
        auxiliar = leerTeclado("Entre número entero a analizar: ");
        float numero = Float.valueOf(auxiliar);

        String esMultiplo = numero % 10.0F == 0 ? "sí" : "no";

        System.out.printf("El número %s es un múltiplo de 10 \n", esMultiplo);
    }

    /*
     * Programa que lea un carácter por teclado y compruebe si es una letra
     * mayúscula
     */
    public static void verificarMayúscula() {
        String auxiliar;
        auxiliar = leerTeclado("Entre caracter a analizar: ");
        Character caracter = auxiliar.charAt(0);
        String esMayuscula = Character.isUpperCase(caracter) ? "sí" : "no";

        System.out.printf("El caracter %s es una letra mayúscula", esMayuscula);
    }

    /*
     * Programa que lea dos números por teclado y muestre el resultado de la
     * división del primer número por el segundo. Se debe comprobar que el divisor
     * no puede ser cero.
     */
    public static void dividir() {
        String auxiliar;
        auxiliar = leerTeclado("Entre dividendo: ");
        float dividendo = Float.valueOf(auxiliar);
        auxiliar = leerTeclado("Entre divisor: ");
        float divisor = Float.valueOf(auxiliar);

        if (divisor != 0.0F) {
            float resultado = dividendo / divisor;
            System.out.println("El resultado de la divisioón es: " + resultado);
        } else {
            System.out.println("No es posible dividir entre cero.");
        }
    }

    /*
     * El programa lee por teclado tres números enteros y calcula y muestra el mayor
     * de los tres
     */
    public static void extrearMayor() {
        String auxiliar;
        auxiliar = leerTeclado("Entre número 1: ");
        float n1 = Float.valueOf(auxiliar);
        auxiliar = leerTeclado("Entre número 2: ");
        float n2 = Float.valueOf(auxiliar);
        auxiliar = leerTeclado("Entre número 3: ");
        float n3 = Float.valueOf(auxiliar);

        float nMenor = Float.max(n1, n2);
        nMenor = Float.max(nMenor, n3);

        System.out.println("El número mayor es: " + nMenor);
    }

    /*
     * Programa que lea por teclado tres números enteros H, M, S correspondientes a
     * hora, minutos y segundos respectivamente, y comprueba si la hora que indican
     * es una hora válida.
     */
    public static void validarHora() {
        String auxiliar;
        auxiliar = leerTeclado("Entre Hora: ");
        float hora = Float.valueOf(auxiliar);

        if (hora >= 24 || hora < 0) {
            System.out.println("Hora no válida");
            return;
        }

        auxiliar = leerTeclado("Entre minutos: ");
        float minuto = Float.valueOf(auxiliar);

        if (minuto >= 60 || minuto < 0) {
            System.out.println("Minutos no válido");
            return;
        }

        auxiliar = leerTeclado("Entre segundos: ");
        float segundo = Float.valueOf(auxiliar);

        if (segundo >= 60 || segundo < 0) {
            System.out.println("Segundos no válido");
            return;
        }
    }

    /*
     * . Programa que lea una variable entera mes y compruebe si el valor
     * corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene
     * 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor
     * introducido esté comprendido entre 1 y 12
     */
    public static void validarFecha() {
        String auxiliar;
        auxiliar = leerTeclado("Entre Mes como valor numérico: ");
        int mes = Integer.valueOf(auxiliar);

        if (mes >= 13 || mes <= 0) {
            System.out.println("Mes no válido");
            return;
        }

        switch (mes) {
            case 1:
                System.out.println("Enero es un mes de 31 días");
                break;
            case 2:
                System.out.println("Febrero es un mes de 28 días");
                break;
            case 3:
                System.out.println("Marzo es un mes de 31 días");
                break;
            case 4:
                System.out.println("Abril es un mes de 30 días");
                break;
            case 5:
                System.out.println("Mayo es un mes de 31 días");
                break;
            case 6:
                System.out.println("Junio es un mes de 30 días");
                break;
            case 7:
                System.out.println("Julio es un mes de 31 días");
                break;
            case 8:
                System.out.println("Agosto es un mes de 31 días");
                break;
            case 9:
                System.out.println("Septiembre es un mes de 30 días");
                break;
            case 10:
                System.out.println("Octubre es un mes de 31 días");
                break;
            case 11:
                System.out.println("Noviembre es un mes de 30 días");
                break;
            case 12:
                System.out.println("Diciembre es un mes de 31 días");
                break;
            default:
                break;
        }
    }

    /*
     * . Realizar programa que muestre los números del 1 al 100 que no sean
     * múltiplos de 3, utilizando cada una las instrucciones repetitivas (while, do
     * while, for
     */
    public static void ciclar() {
        System.out.println("Ciclo for");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("Ciclo Do While");
        int i = 1;
        do {
            if (i % 3 != 0) {
                System.out.println(i + " ");
            }
            i++;
        } while (i <= 100);

        System.out.println("Ciclo While");
        i = 1;
        while (i <= 100) {
            if (i % 3 != 0) {
                System.out.println(i + " ");
            }
            i++;
        }
    }

    /* Programa que pase de pesos a dólares y viceversa */
    public static void convertirDivisa() {
        final float FACTOR = 3500;
        String auxiliar;
        auxiliar = leerTeclado("Entre (1) para dolar a pesos y (2) para pesos a dolar: ");
        int opcion = Integer.valueOf(auxiliar);

        if (opcion == 1) {
            auxiliar = leerTeclado("Entre valor dolares a convertir");
            float dolares = Float.valueOf(auxiliar);
            float pesos = dolares * FACTOR;
            System.out.printf("El valor en pesos es: $%f", pesos);
        } else if (opcion == 2) {
            auxiliar = leerTeclado("Entre valor pesos a convertir");
            float pesos = Float.valueOf(auxiliar);
            float dolares = pesos / FACTOR;
            System.out.printf("El valor en pesos es: $%f", dolares);
        } else {
            System.out.printf("No se escribió una opción válida");
        }
    }

    /* Mostrar los N primeros términos de la serie de Fibonacci. */
    public static void escribirSerieFibonacci() {
        String auxiliar;
        auxiliar = leerTeclado("Entre números a calcular de la serie Fibonacci: ");
        int N = Integer.valueOf(auxiliar);

        int F1 = 1;
        int F2 = 1;

        if (N < 1) {
            System.out.println("Número no válido");
        } else if (N == 1) {
            System.out.println("1");
        } else {
            System.out.println(F1);
            System.out.println(F2);
            for (int i = 3; i <= N; i++) {
                int aux = F1 + F2;
                System.out.println(aux);
                F1 = F2;
                F2 = aux;
            }
        }
    }

    /*
     * Leer un número N y calcular la suma de los factoriales de los números desde 0
     * hasta N
     */
    public static void calcularFactorial() {
        String auxiliar;
        auxiliar = leerTeclado("Entre número para calcular factorial : ");
        int N = Integer.valueOf(auxiliar);

        if (N < 0) {
            System.out.println("Valor no válido");
        }

        int i = 1;
        int resultado = 1;
        do {
            resultado *= i;
            i++;
        } while (i <= N);
        System.out.println("El factorial es: " + resultado);
    }

    /*
     * Programa que muestre en líneas separadas lo siguiente:
     * ZYWXVUTSRQPONMLKJIHGFEDCBA YWXVUTSRQPONMLKJIHGFEDCBA WXVUTSRQPONMLKJIHGFEDCBA
     * .... DCBA CBA BA A
     */
    public static void imprimerSecuenciaAlfabetica() {
        String impresiones = "";
        final int FIN = 90;
        int longitud = 26;
        int i = 0;

        while (longitud > 0) {
            impresiones = "";
            i = 0;
            while (i < longitud) {
                impresiones += Character.toString(FIN - i);
                i++;
            }
            System.out.println(impresiones);
            longitud--;
        }

    }

    /* Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E. */
    public static void formatearContador() {
        String s = "";
        for (int i = 1; i <= 99999; i++) {
             s = String.valueOf(i);      
             s= s.replace("3", "E");
             System.out.println(s);     
        }
    }
}
