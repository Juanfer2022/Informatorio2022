package level2;

public class E6_Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int horasTrabajadas;
    private double valorHora;

    public E6_Persona(String nombre, String apellido, String dni, int horasTrabajadas, double valorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas
                + ", valorHora=" + valorHora;
    }

}
