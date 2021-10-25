package JavaBasic;

public class IsMultiple {
    public static void main(String[] args) {
        var n = 4;
        var m = 2;

        var result = isMultiple(n, m);

        System.out.println(n + " is multiple of " + m + " = " + result);
    }

    private static boolean isMultiple(long n, long m) {
        return n % m == 0;
    }
}
