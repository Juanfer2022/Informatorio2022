package level1;

public class Ejercicio9 {
    public static void main(String[] args) {
        String cadena = "informatorio";
        char caracter = 'o';

        int encontrado = contarCaracteres(cadena, caracter);

        if (encontrado == 0) {
            // Si el caracter buscado no esta en la palabra
            System.out.println("La letra " + "'" + caracter + "'" + " no aparece en la palabra " + cadena + ".-");
        } else {
            // Hay coincidencia
            System.out.println("La letra " + "'" + caracter + "'" + " aparece " + encontrado + " vez/ces.-");
        }
    }

    // calcular el número de veces
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        // se busca la primera vez, si no esta arroa -1
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { // mientras se encuentre el caracter
            contador++; // se cuenta
            // se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }

        return contador;

    }
}
