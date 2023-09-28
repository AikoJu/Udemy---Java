package secao4;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        System.out.println("Hello World!" + '\u00FF');
        System.out.println("Hello World!" + '\u00FF');

        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483600;
        float e = 1;

        System.out.println(a + " " + b+ " " +c+ " " +d+ " " +e);

    }
}
