package secao5.atividades;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro:");
        num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }
    }
}
