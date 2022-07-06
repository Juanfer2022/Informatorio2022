package level2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class Ejercicio6 {
   
    public static void main(String[] args) {

        E6_Persona per1 = new E6_Persona("Julio", "Argento","1412456" , 20, 345);
        E6_Persona per2 = new E6_Persona("Jacinto", "Arghtro","1212456" , 12, 375);
        E6_Persona per3 = new E6_Persona("Pedro", "Bertis","1112456" , 22, 445);
        E6_Persona per4 = new E6_Persona("Pelusa", "Arguello","1812456" , 16, 455);
        Set<E6_Persona>  empleado = new HashSet<E6_Persona>();
        empleado.add(per1);
        empleado.add(per2);
        empleado.add(per3);
        empleado.add(per4);

        
        Map<String, Double> sueldo=new HashMap<>();
       
        for (E6_Persona empl : empleado) {      
            sueldo.put(empl.getDni(),(empl.getHorasTrabajadas() * empl.getValorHora()) );  
        }

        for (Entry<String, Double> regis : sueldo.entrySet()) {
            System.out.println("Id "+ regis.getKey()+ " Sueldo: " + regis.getValue());
            
        }
    }


}
