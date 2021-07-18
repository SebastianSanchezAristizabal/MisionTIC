package com.example;
import java.util.Scanner;

/*public class HolaQuien {

    public static void main(String[] args) {
        
    }
}*/

public class HolaQuien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre    ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + "!");
        sc.close();
    }
}
