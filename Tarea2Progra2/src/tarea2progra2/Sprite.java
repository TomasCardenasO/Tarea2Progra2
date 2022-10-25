package tarea2progra2;

public class Sprite extends Bebida {
    public Sprite(int s) {
        super(s);
    }
    public String beber() {
        String sabor = super.beber();
        return sabor + "sprite";
    }
}
