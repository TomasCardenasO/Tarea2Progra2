package tarea2progra2;
import java.util.ArrayList;

public class Deposito {
    private ArrayList <Bebida> arr;
    public Deposito() {
        arr = new ArrayList();
    }
    public void addBebida(Bebida b) {
        arr.add(b);
    }
    public Bebida getBebida() {
        Bebida aux;
        if(arr.size() == 0) {
            return null;
        } else {
            aux = arr.get(0);
            arr.remove(0);
            return aux;
        }
    }
}
