package exceptions;


@SuppressWarnings("serial")
public class ProductExpiredException extends Exception {

    public ProductExpiredException() {
        super("The product has expired");
    }
}
