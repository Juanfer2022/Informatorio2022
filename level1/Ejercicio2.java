package level1;

import java.util.Scanner;

public class Ejercicio2 {
   
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double num1;
        double num2;

        //Solicitar datos al usuario
        System.out.println("Ingresa dos números para realiar suma, resta, multiplicación, división y módulo de ambos");
        System.out.println("Ingresa el primer número y aprieta Enter");
        num1 = num.nextDouble();
        System.out.println("Ingresa el segundo número y aprieta Enter");
        num2 = num.nextDouble();

        //Realizar las operaciones y mostrar en la pantalla
        System.out.println("La suma entre: " + num1 + " y " + num2 + " es: " + (num1+num2));
        System.out.println();
        System.out.println("La resta entre: " + num1 + " y " + num2 + " es: " + (num1-num2));
        System.out.println();
        System.out.println("La multiplicación entre: " + num1 + " y " + num2 + " es: " + (num1*num2));
        System.out.println();
        System.out.println("La división entre: " + num1 + " y " + num2 + " es: " + (num1/num2));
        System.out.println();
        System.out.println("El módulo entre: " + num1 + " y " + num2 + " es: " + (num1 % num2));
        
    }

}
