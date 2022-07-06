package level1;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Ejercicio8_1 ejercicio8_1 = new Ejercicio8_1("","",
                "","");

                Scanner nom = new Scanner(System.in);
               
                System.out.println("Ingresa tu Nombre y Apellido y Enter para continuar");
                ejercicio8_1.nombreYApellido=nom.nextLine();
                
                System.out.println("Ingresa tu edad y Enter para continuar");
                ejercicio8_1.edad= nom.nextLine() ;
                
                System.out.println("Ingresa tu direccion y Enter para continuar");
                ejercicio8_1.direccion=nom.nextLine();
                
                System.out.println("Ingresa tu ciudad y Enter para continuar");
                ejercicio8_1.ciudad= nom.nextLine();

        System.out.println(ejercicio8_1);

    }

}
