package tarea2progra2;
import java.util.ArrayList;

public class DepositoDeVuelto {
    private ArrayList <Moneda> arr;
    public DepositoDeVuelto() {
        arr = new ArrayList();
    }
    public void addMoneda(Moneda m) {
        arr.add(m);
    }
    public Moneda getMoneda() {
        Moneda aux;
        if(arr.size() == 0) {
            return null;
        } else {
            aux = arr.get(0);
            arr.remove(0);
            return aux;
        }
    }
}
