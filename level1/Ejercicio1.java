package level1;

import java.util.Scanner;

public class Ejercicio1 {
   
    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre y aprieta Enter para continuar");
        String nombre;

        Scanner nom = new Scanner(System.in);
        nombre = nom.nextLine();

        System.out.println("HOLA " + "{"+ nombre.toUpperCase()+ "}!!!");
    } 
}