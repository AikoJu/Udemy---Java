package secao5.atividades;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Digite um número qualquer:");
        double num = in.nextDouble();

        if (num > 0.0) {
            if (num <= 25) {
                System.out.println("Intervalo [0,25]");
            } else if (num <= 50) {
                System.out.println("Intervalo (25,50]");
            } else if (num <= 75) {
                System.out.println("Intervalo (50,75]");
            } else if (num <= 100) {
                System.out.println("Intervalo (75,100]");
            }
        } else{
            System.out.println("Fora de intervalo");
        }

    }
}
