package secao5;

import java.util.Locale;
import java.util.Scanner;

public class OperadorCumulativa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int minutos = in.nextInt();

        double conta = 50.0;

        if(minutos > 100){
            conta += (minutos - 100 ) * 2;
        }

        System.out.println("Valor da conta R$:" + conta);
    }
}
