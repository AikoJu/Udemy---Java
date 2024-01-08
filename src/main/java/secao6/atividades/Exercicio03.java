package secao6.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número de testes");
        Integer numTeste = in.nextInt();

        for (int i = 0; i < numTeste; i++ ){
            System.out.println("Digite o primeiro número:");
            Double a = in.nextDouble();
            System.out.println("Digite o segundo número:");
            Double b = in.nextDouble();
            System.out.println("Digite o terceiro número:");
            Double c = in.nextDouble();

            Double media = (a * 2.0 + b * 3.0 + c * 5.0 ) / 10.0;

            System.out.printf("%.1f%n", media);

        }



    }
}
