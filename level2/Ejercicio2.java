package level2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeroEntero = new ArrayList<>();
        cargarNumerosEnteros(numeroEntero);

        System.out.println("El tamaño del ArrayList es: " + numeroEntero.size() +
                ", y sus elementos hasta ahora son:");

        for (int numeros : numeroEntero) {
            System.out.print(numeros + ", ");
        }

        insertarPrimeroYUltimo(numeroEntero);

        System.out.println("");
        System.out.println("Se ha agrgado un elemento al inicio y otro al final del ArrayList");
        System.out.println("El tamaño del ArrayList ahora es: " + numeroEntero.size() +
                ", y sus elementos  ahora son:");

        for (int numeros : numeroEntero) {
            System.out.print(numeros + ", ");
        }

    }

    public static void cargarNumerosEnteros(ArrayList<Integer> numeroEntero) {
        for (int i = 1; i <= 5; i++) {
            numeroEntero.add((int) Math.round(Math.random() * 10));
        }

    }

    public static void insertarPrimeroYUltimo(ArrayList<Integer> numeroEntero) {

        numeroEntero.add(0, (int) Math.round(Math.random() * 10));
        numeroEntero.add((int) Math.round(Math.random() * 10));

    }

}
