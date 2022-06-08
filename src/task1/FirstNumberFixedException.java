package task1;

public class FirstNumberFixedException extends Exception {
    @Override
    public String getMessage() {
        return "The first numbers of the line are not 555";
    }

    @Override
    public String toString() {
        return "FirstNumberFixedException: " + getMessage();
    }
}
