package level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        List<String> alumnos = new ArrayList<String>(12);
        cargarAlumnos(alumnos);
        separar(alumnos);
    }

    // Carga los alumnos
    public static void cargarAlumnos(List<String> alumnos) {
        String alumn[] = { "Maria", "Patricia", "Josefa", "Luisa", "Jacinta",
                "Paula", "Laura", "Lucrecia", "Mirta", "Jauelin", "Zulma", "Nora" };

        for (String nombre : alumn) {
            alumnos.add(nombre);
        }
        System.out.println("La lista de alumnos es: ");
        System.out.println(alumnos);
        System.out.println();
    }

    // Se separa en los cursos y mostrar
    public static void separar(List<String> alumnos) throws Exception {

        try {
            List<String> curso1 = alumnos.subList(0, 4);
            List<String> curso2 = alumnos.subList(4, 8);
            List<String> curso3 = alumnos.subList(8, 12);

            System.out.println("La division quedo de la siguiente manera: ");
            System.out.println("CURSO 1");
            System.out.println(curso1);
            System.out.println("CURSO 2");
            System.out.println(curso2);
            System.out.println("CURSO 3");
            System.out.println(curso3);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }

        catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }

    }

}
