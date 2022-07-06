package level1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1;
        int num2;

        // Solicitar datos al usuario
        System.out.println("Ingresa dos números para realiar la potencia de ambos ");
        System.out.println("Ingresa el primer número y aprieta Enter");
        num1 = num.nextInt();
        System.out.println("Ingresa el segundo número y aprieta Enter");
        num2 = num.nextInt();

        // calculo multiplicación
        int resultado = 1;
        for (int i = 1; i <= num2; i++) {
            resultado = resultado * num1;
        }
        
        // Mostrar
        System.out.println(num1 + " elevado a la  " + num2 + "° potencia es: " + resultado);
    }
}
