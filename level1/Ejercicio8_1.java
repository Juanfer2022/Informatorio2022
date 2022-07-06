package level1;

public class Ejercicio8_1 {
    
     public String nombreYApellido;
     public String edad;
     public String direccion;
     public String ciudad;

    public Ejercicio8_1(String nombreYApellido, String edad, String direccion, String ciudad) {
        this.nombreYApellido = nombreYApellido;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    

    public Ejercicio8_1() {
    }


    @Override
    public String toString() {
        return "Ciudad: " + ciudad + 
                " direccion = " + direccion + 
                " edad= " + edad + 
                " nombre Y Apellido = " + nombreYApellido;
    }
}
