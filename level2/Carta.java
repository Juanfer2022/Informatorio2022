package level2;

public class Carta {
    
    public static final String[] FIGURAS={"TREBOL", "CORAZON", "PICA", "DIAMANTE"};

    private int valor;
    private String figura;

    public Carta(int valor, String figura) {
        this.valor = valor;
        this.figura = figura;
    }
    
    @Override
    public String toString() {
        return valor+" "+figura.toString().toLowerCase()+" ";
    }

    public void imprimir(){
        System.out.print(valor+" "+figura.toString().toLowerCase()+" ");
    }

}
