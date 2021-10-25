package JavaBasic;

public class SumOfSmallerNum {
    public static void main(String[] args) {
        System.out.println(sumOfSmallerNum(4));
        System.out.println(sumOfSmallerNum(5));
        System.out.println(sumOfSmallerOddNum(4));
    }

    private static int sumOfSmallerNum(int num) {
        var result = 0;
        num--;
        while (num > 0) {
            result += num;
            num--;
        }

        return result;
    }

    public static int sumOfSmallerOddNum(int num) {
        var result = 0;

        if (isOdd(num)) {
            num -= 2;
        } else {
            num--;
        }

        while (num > 0) {
            result += num;
            num -= 2;
        }

        return result;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
