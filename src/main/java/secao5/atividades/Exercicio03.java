package secao5.atividades;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite 2 números inteiros:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 % num2 == 0 || num2  % num1 == 0 ){
            System.out.println("São Multiplos");
        }else {
            System.out.println("Não São Multiplos");
        }
    }
}
