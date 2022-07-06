package level1;

public class Ejercicio4 {
    public static void main(String[] args) {

        long num = 12;
        long sacaFact = sacaF(num);
        System.out.println("El factorial de " + num + " es: " + sacaFact);
    }

    public static long sacaF(long num) {
        long factori;
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * sacaF(num - 1);
    }
}
