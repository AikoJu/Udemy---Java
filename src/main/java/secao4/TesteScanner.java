package secao4;

import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        String x;
        int y;
        double z;
        char a;

        x=in.next();
        y=in.nextInt();
        z=in.nextDouble();
        a=in.next().charAt(0);

        System.out.println("""
                           Você digitou %s
                           %d
                           %.2f
                           %c""".formatted(x,y,z,a));
        in.close();


    }
}
