package JavaBasic;

import java.util.Scanner;

public class InputAllBaseTypes {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }

    private static void inputAllBaseTypes() {
        var scanner = new Scanner(System.in);

        System.out.print("Type an int: ");
        var intNum = scanner.nextInt();

        System.out.print("Type a byte: ");
        var byteNum = scanner.nextByte();

        System.out.print("Type a float: ");
        var floatNum = scanner.nextFloat();

        System.out.print("Type an boolean: ");
        var bool = scanner.nextBoolean();

        System.out.println("Int: " + intNum);
        System.out.println("Byte: " + byteNum);
        System.out.println("Float: " + floatNum);
        System.out.println("Boolean: " + bool);
    }
}
