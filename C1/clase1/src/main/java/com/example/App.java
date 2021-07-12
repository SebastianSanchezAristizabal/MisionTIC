//package com.example;
package clase1.src.main.java.com.example;
import java.util.Scanner;

/*
public class App 
{
    public static void main( String[] args )
    {
        String nombre = "Sebastian";
        System.out.println( "Hola " + nombre);
    }
}*/

/**
 * Implemente un algoritmo que reciba un número por teclado y cuente cuántas cifras (o dígitos) contiene e imprima el mensaje en consola
 */
public class App 
{
    public static void main( String[] args )
    {
        //Digitos();
        //DobleTriple();
        //ConversionFahrenheit();
        AnalizarPar();
    }

    /*
     * Implemente un algoritmo que reciba un número por teclado y cuente cuántas cifras (o dígitos) contiene e imprima el mensaje en consola.
     */
    public static void Digitos()
    {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese un valor numérico");
        int numero = sc.nextInt();
        int nDigitos = 0;
        while (numero != 0)
        {
            nDigitos++;
            numero = numero/10;
        }
        System.out.println("El numero ingresado tiene " + nDigitos + " Dígitos");
        sc.close();
    }

    /*
     * Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número
     */
    public static void DobleTriple()
    {
        System.out.println("Ingrese el número a analizar");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numeroDoble = numero*2;
        int numeroTriple = numero*3;
        String msg = "El número triple es: " + numeroTriple + " El número doble es: " + numeroDoble;
        System.out.println(msg);
        sc.close();
    }

    /*
     * Escribe un programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)
     */
    public static void ConversionFahrenheit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese temperatura en grados centigrados a convertir: ");
        float AConvertir = sc.nextFloat();
        float convertido = 32 + (9*AConvertir /5);
        System.out.println("El valor convertido es: " + convertido);
        sc.close();
    }

    /*
     * Escribe un programa java que lea una variable de tipo entero y asígnale un valor. 
     * A continuación muestra un mensaje indicando si la variable es par o impar. 
     * Utiliza el operador condicional ( ? : ) para resolverlo.
     */
    public static void AnalizarPar()
    {
        System.out.println("Escriba un número a analizar: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        String esPar = numero % 2 == 0 ? "es par" : "es impar";
        System.out.println("El número " + esPar);
    }
}
