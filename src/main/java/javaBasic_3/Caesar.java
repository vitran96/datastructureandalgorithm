package javaBasic_3;

import java.util.Arrays;

public class Caesar {
    public static final int ALPHASIZE = 26;
    public static final int ROT_TYPE = 13;
    public static final char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    protected char[] encrypt = new char[ALPHASIZE];
    protected char[] decrypt = new char[ALPHASIZE];

    public Caesar() {
        for (var i = 0; i < ALPHASIZE; i++) {
            var step = (i + ROT_TYPE) % ALPHASIZE;
            encrypt[i] = alpha[step];
        }

        for (var i = 0; i < ALPHASIZE; i++) {
            decrypt[encrypt[i] - 'A'] = alpha[i];
        }

//        System.out.println("Arrays.toString(alpha)   = " + Arrays.toString(alpha));
//        System.out.println("Arrays.toString(encrypt) = " + Arrays.toString(encrypt));
//        System.out.println("Arrays.toString(decrypt) = " + Arrays.toString(decrypt));
    }

    public String encrypt(String secret) {
        char[] mess = secret.toCharArray();
        for (var i = 0; i < mess.length; i++) {
            if (Character.isUpperCase(mess[i])) {
                mess[i] = encrypt[mess[i] - 'A'];
            }
        }

        return new String(mess);
    }

    public String decrypt(String secret) {
        return decrypt(secret, 0);
    }

    private String decrypt(String secret, int i) {
        if (i < secret.length()) {
            char c = secret.charAt(i);
            if (Character.isUpperCase(c)) {
                return decrypt[c - 'A'] + decrypt(secret, ++i);
            }
            return c + decrypt(secret, ++i);
        }

        return "";
    }

    public static void main(String[] args) {
        Caesar cipher = new Caesar();
        System.out.println("Encryption order = " + new String(cipher.encrypt));
        System.out.println("Decryption order = " + new String(cipher.decrypt));
        String secret = "THE EAGLE IS IN PLAY; MEET AT JOE's.";
        secret = cipher.encrypt(secret);
        System.out.println(secret);
        secret = cipher.decrypt(secret);
        System.out.println(secret);
    }
}
