package task2;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Wrong password: a length of password must be less then 20 symbols, password mustn't contain spaces and must contain one digit at least!";
    }
}
