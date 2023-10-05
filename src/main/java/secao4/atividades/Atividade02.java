package secao4.atividades;

import javax.swing.*;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Double raio,resultado,resultado2, pi = 3.14159;

        System.out.println("Digite o valor do raio:");
        raio = in.nextDouble();

        resultado = Math.PI * (Math.pow(raio,2.0));
        resultado2 = pi * (Math.pow(raio,2.0));

        System.out.println(String.format("Valor da área: %.4f \n%.4f ",resultado,resultado2));

    }
}
