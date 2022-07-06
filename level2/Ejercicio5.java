package level2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorHora = new ArrayList<Integer>();
        ArrayList<Integer> totales = new ArrayList<Integer>();
        cargarHorasTrabaadas(horasTrabajadas);
        cargarValorHora(valorHora);
        cargarTotales(totales, valorHora, horasTrabajadas);
        imprimir(totales, valorHora, horasTrabajadas);

    }

    public static void cargarHorasTrabaadas(ArrayList<Integer> horasTrabajadas) {

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);

    }

    public static void cargarValorHora(ArrayList<Integer> valorHora) {

        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);

    }

    public static void cargarTotales(ArrayList<Integer> totales,
            ArrayList<Integer> valorHora, ArrayList<Integer> horasTrabajadas) {

        Integer producto;
        Iterator iteratorHora = horasTrabajadas.iterator();
        Iterator iteratorValor = valorHora.iterator();

        while (iteratorHora.hasNext()) {
            while (iteratorValor.hasNext()) {
                producto = (Integer) iteratorValor.next() * (Integer) iteratorHora.next();
                totales.add(producto);
            }
        }

    }

    public static void imprimir(ArrayList<Integer> totales,
            ArrayList<Integer> valorHora, ArrayList<Integer> horasTrabajadas) {

        System.out.println("Horas trabajadas: "+horasTrabajadas);
        System.out.println("Valor hora de trabajo: "+valorHora);
        System.out.println("Totales: "+totales);
    }
}
