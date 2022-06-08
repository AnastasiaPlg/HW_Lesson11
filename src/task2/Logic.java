package task2;

public class Logic {
    public static boolean addUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int result = 0;
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException();
        } else {
            result++;
        }
        if (password.length() >= 20 || password.contains(" ") || (password + " ").split("\\d").length == 1) {
            throw new WrongPasswordException();
        } else {
            result++;
        }
        if (password.equals(confirmPassword)) {
            result++;
        } else {
            System.out.println("password and confirmPassword are not equals");
        }
        if (result == 3) {
            return true;
        } else {
            return false;
        }
    }
}
