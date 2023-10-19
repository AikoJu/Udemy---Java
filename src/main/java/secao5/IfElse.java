package secao5;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int x = 5;
        int hora;

        Scanner in = new Scanner(System.in);

        System.out.println("Quantas horas?");
        hora = in.nextInt();

        if(hora < 12)
            System.out.println("Bom dia!");
        else if (hora < 18)
                System.out.println("Boa tarde!");
        else
                System.out.println("Boa noite!");


        if (x < 0){
            System.out.println("Boa tarde!");
        }

        System.out.println("Boa noite!");

    }
}
