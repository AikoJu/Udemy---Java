package secao6;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);
        String cont;

        do {
            System.out.println("Digite a temperatura em Celsius:");
            Double tempCel = in.nextDouble();
            Double tempFar = tempCel * 9 / 5 + 32;
            System.out.println("""
                        A temperatura em Fahrenheit é: %.1f%n
                        Deseja ver nova temperatura? (s/n)""".formatted(tempFar));
            cont = in.next();
        }while (cont.equals("s"));
    }
}
