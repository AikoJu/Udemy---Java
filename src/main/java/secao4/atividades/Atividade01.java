package secao4.atividades;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a,b,resultado;
        System.out.println("Digite 2 números para somar:");
        a = in.nextInt();
        b = in.nextInt();
        resultado = a + b;
        System.out.println("Soma = " +resultado);

        in.close();

    }
}
