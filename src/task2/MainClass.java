package task2;

public class MainClass {
    public static void main(String[] args) {
       try {
           boolean result = Logic.addUser("a.a.pligina", "qwerty33", "qwerty33");
           System.out.println(result);
       } catch (WrongLoginException e) {
           System.out.println(e);
       } catch (WrongPasswordException e) {
           System.out.println(e);
       }
    }
}
