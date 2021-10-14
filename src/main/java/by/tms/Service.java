package by.tms;

public class Service {

    public static double selection(String op, double n1, double n2) {
        switch (op) {
            case "sum":
                return summ(n1, n2);
            case "div":
                return div(n1, n2);
            case "subtrack":
                return subtrack(n1, n2);
            case "multiply":
                return multiply(n1, n2);
            default:
                break;
        }
        return 0;
    }

    public static double summ(double n1, double n2) {
        return n1 + n2;
    }

    public static double div(double n1, double n2) {
        return n1 / n2;
    }

    public static double subtrack(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiply(double n1, double n2) {
        return n1 * n2;
    }

}
