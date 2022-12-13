public class OurExceptionUnchecked extends RuntimeException{
    public OurExceptionUnchecked() {
    }

    public OurExceptionUnchecked(String message) {
        super(message);
    }
}
