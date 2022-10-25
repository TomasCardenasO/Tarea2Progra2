package exceptions;
import java.lang.Exception;

public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(String errorMessage) {
        super(errorMessage);
    }
}
