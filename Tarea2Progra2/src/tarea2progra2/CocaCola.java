package tarea2progra2;

public class CocaCola extends Bebida {
    public CocaCola(int s) {
        super(s);
    }
    public String beber() {
        String sabor = super.beber();
        return sabor + "cocacola";
    }
}
