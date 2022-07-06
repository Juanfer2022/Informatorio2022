package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println(fisfus());
    }

public static ArrayList<String> fisfus(){
    int num1 = 1;
    int num2 = 8;
    ArrayList<String> fbf = new ArrayList<>();
        
    for (int i = num1; i < num2; i++) {
        if (i % 6==0) {
            fbf.add("\"FizzBuzz\"");
        } else if (i % 2 == 0) {
            fbf.add("\"Fizz\"");
        } else if (i % 3 == 0) {
            fbf.add("\"Buzz\"");
        } else {
            fbf.add("\""+String.valueOf(i)+"\"");

          }
    }
    return fbf;    
}


}
