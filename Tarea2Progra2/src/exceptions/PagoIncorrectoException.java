package exceptions;
import java.lang.Exception;

public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String errorMessage) {
        super(errorMessage);
    }
}
