package task1;

public class StringAnalysis {
    public static void findSubstring(String line) throws ContainsLineException {
        if (line.toLowerCase().contains("abc".toLowerCase())) {
            System.out.println("The line contains substring \"abc\"");
        } else {
            throw new ContainsLineException();
        }
    }

    public static void areFirstNumbersFixed(String line) throws FirstNumberFixedException {
        if (line.startsWith("555")) {
            System.out.println("The line starts with numbers 555");
        } else {
            throw new FirstNumberFixedException();
        }
    }

    public static void areLastSymbolsFixed(String line) throws LastSymbolsFixedException {
        if (line.endsWith("1a2b")) {
            System.out.println("The line ends with symbols \"1a2b\"");
        } else {
            throw new LastSymbolsFixedException();
        }
    }
}
