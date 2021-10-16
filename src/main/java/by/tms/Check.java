package by.tms;

public class Check {

    public static boolean checkString(String str) {
        return str.equals("sum") || str.equals("div") || str.equals("subtrack") || str.equals("multiply");
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
