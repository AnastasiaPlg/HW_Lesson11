package task1;

public class LastSymbolsFixedException extends Exception {
    @Override
    public String getMessage() {
        return "The last symbols of the line are not \"1a2b\"";
    }

    @Override
    public String toString() {
        return "LastSymbolsFixedException: " + getMessage();
    }
}
