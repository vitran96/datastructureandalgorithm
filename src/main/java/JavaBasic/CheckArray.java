package JavaBasic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CheckArray {
    public static void main(String[] args) {
        var random = new Random();
        var arrayInts = random.ints(5, 0, 10).toArray();

        System.out.println("hasPairWithProductIsOddNum = " + hasPairWithProductIsOddNum(arrayInts));
        System.out.println("arrayNumIsDistinct = " + arrayNumIsDistinct(arrayInts));
    }

    private static boolean hasPairWithProductIsOddNum(int[] array) {
        if (array.length == 0
            || array.length == 1) {
            return false;
        }

        var lastNum = array[0];
        for (var i = 1; i < array.length; i++) {
            if (lastNum * array[i] % 2 != 0) {
                return true;
            }

            lastNum = array[i];
        }

        return false;
    }

    private static boolean arrayNumIsDistinct(int[] array) {
        var listOfDistinctNum = new LinkedList<Integer>();
//        aaaa:
        for (var num : array) {
            if (listOfDistinctNum.contains(num)) {
                return false;
//                continue aaaa;
            }

            listOfDistinctNum.add(num);
        }

        return true;
    }
}
