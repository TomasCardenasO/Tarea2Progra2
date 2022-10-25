package tarea2progra2;

public abstract class Bebida {
    private int serie;
    public Bebida(int numSerie) {
        serie = numSerie;
    }
    public int getSerie() {
        return serie;
    }
    public abstract String beber();
}
