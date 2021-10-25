package javaBasic_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CountVowel {
    private static final List<Character> VOWELS = new ArrayList<>();

    public static int count(String str) {
        str = str.toLowerCase();

        int counter = 0;
        for (var i = 0; i < str.length(); i++) {
            if (VOWELS.contains(str.charAt(i)))
                counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        VOWELS.add('e');
        VOWELS.add('u');
        VOWELS.add('o');
        VOWELS.add('a');
        VOWELS.add('i');
        System.out.println(count("hello"));
    }
}
