package secao6.atividades;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor a ser fatoriado:");
        Integer n = in.nextInt();
        Integer fat = 1;

        for (int i = 1 ; i <= n; i ++){
            fat = fat * i;
        }

        System.out.println(fat);
    }
}
