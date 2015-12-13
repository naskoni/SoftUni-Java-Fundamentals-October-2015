package exceptions;

@SuppressWarnings("serial")
public class NoQuantityException extends Exception {
    public NoQuantityException() {
        super("There is no quantity of this stock");
    }
}
