package exceptions;
import java.lang.Exception;

public class NoHayBebidaException extends Exception {
    public NoHayBebidaException(String errorMessage) {
        super(errorMessage);
    }
}
