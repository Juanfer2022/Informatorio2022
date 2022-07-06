package level2;

public class Ejercicio3 {
    public static void main(String[] args) {
        Baraja mazo1 = new Baraja();
        mazo1.imprimir();
        mazo1.imprimirR();
        mazo1.desordenar();
        System.out.println("");
        System.out.println("Se desordenaron (mezclaron) las cartas y quedaron asi: ");
        System.out.println("");
        mazo1.imprimir();

    }

}
