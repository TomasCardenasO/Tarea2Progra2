package tarea2progra2;

public class Fanta extends Bebida {
    public Fanta(int s) {
        super(s);
    }
    public String beber() {
        String sabor = super.beber();
        return sabor + "fanta";
    }
}
