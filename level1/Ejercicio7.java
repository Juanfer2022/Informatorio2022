package level1;

public class Ejercicio7 {
    public static void main(String[] args) {
        String string = "InforMatorio";

        for (int i = 0; i < string.length(); i++) {
            int stringNew = string.charAt(i);

            if (stringNew > 96 && stringNew < 123) {
                stringNew = stringNew - 32;
                System.out.print((char) stringNew);
            } else {
                System.out.print((char) stringNew);
            }
        }
    }
}
