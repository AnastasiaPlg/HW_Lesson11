package task2;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Wrong login: a length of login must be less then 20 symbols, and login mustn't contain spaces!";
    }
}
