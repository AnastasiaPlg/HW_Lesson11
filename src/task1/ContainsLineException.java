package task1;

public class ContainsLineException extends Exception {
    @Override
    public String getMessage() {
        return "The line doesn't contain substring \"abc\"";
    }

    @Override
    public String toString() {
        return "ContainsLineException: " + getMessage();
    }
}
