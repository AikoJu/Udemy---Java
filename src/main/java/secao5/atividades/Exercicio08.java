package secao5.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double valor = 0 ;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu salário:");
        double salario = in.nextDouble();

        if(salario <= 2000) {
            valor = 0;
        } else if (salario <= 3000 ) {
            valor = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            valor = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else if (salario > 4500) {
            valor = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }
        else {
            System.out.println("Valor inválido!");
        }

        System.out.println(String.format("R$ %.2f",valor));


    }
}
