package level2;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();

        cargarCiudades(ciudades);

        int i = 1;
        for (String ciudad : ciudades) {
            System.out.println("#" + i + " " + ciudad);
            i++;
        }

    }

    public static void cargarCiudades(ArrayList<String> ciudades) {
        ciudades.add("Bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");
    }

}
