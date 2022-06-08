package task1;

public class MainClass {
    public static void main(String[] args) {
        String line = "5556-oiU-9874-kJh-1r2f";
        try {
            StringAnalysis.findSubstring(line);
        } catch (ContainsLineException e) {
            System.out.println(e);
        }
        try {
            StringAnalysis.areFirstNumbersFixed(line);
        } catch (FirstNumberFixedException e) {
            System.out.println(e);
        }
        try {
            StringAnalysis.areLastSymbolsFixed(line);
        } catch (LastSymbolsFixedException e) {
            System.out.println(e);
        }
    }
}
