package JavaBasic;

public class IsOdd {
    public static void main(String[] args) {
        var i = -1008;
        var result = isOdd(i);
        System.out.println(i + " is odd = " + result);
    }
    private static boolean isOdd(int i) {
        var numString = Integer.toString(i);
        var lastChar = numString.charAt(numString.length() - 1);
        var lastDigit = Integer.valueOf(lastChar);

        var numToCheck= lastDigit;
        while (numToCheck >= 0) {
            if (numToCheck == 0
                || numToCheck == 2) {
                return false;
            } else if (numToCheck == 1) {
                return true;
            }

            numToCheck -= 2;
        }

        return false;
    }
}
