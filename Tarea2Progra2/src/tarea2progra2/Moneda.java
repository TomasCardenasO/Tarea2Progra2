package tarea2progra2;

public abstract class Moneda {
    public Moneda() {
        
    }
    public String getSerie() {
        return this.toString();
    }
    public abstract int getValor();
}
