package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Baraja {
    private ArrayList<Carta> cartas;
    private int cantidadCarta = 40;
    private int cantFiguras = 10;
    private int i = 1;

    public Baraja() {
        cartas = new ArrayList<Carta>(cantidadCarta);

        for (String figura : Carta.FIGURAS) {
            for (int i = 1; i <= cantFiguras; i++) {
                cartas.add(new Carta(i, figura));
            }
        }
        System.out.println("Se cargo la baraja con: " + cartas.size() + " cartas y son las siguientes: ");
        System.out.println("");
    }

    public void imprimir() {
        System.out.println("");
        for (Carta carta : cartas) {
            carta.imprimir();
            i++;
            if (i == 11) {
                i = 1;
                System.out.println(" ");
            }
        }
        System.out.println("");
    }

    // imprime arrayList inverso
    public void imprimirR() {
        Iterator<Carta> impRev = cartas.iterator();
        ListIterator cart = cartas.listIterator(cartas.size());

        System.out.println("");
        System.out.println("El mazo de cartas Francesas ahora se imprime al reves ");
        System.out.println("");

        while (cart.hasPrevious()) {
            System.out.print(cart.previous().toString());
            i++;
            if (i == 11) {
                i = 1;
                System.out.println(" ");
            }
        }
    }

    public void desordenar() {
        Collections.shuffle(cartas);
    }
}
