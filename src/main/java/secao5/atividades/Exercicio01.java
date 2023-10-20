package secao5.atividades;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro?");
        num = in.nextInt();

        if(num < 0){
            System.out.println("NEGATIVO");
        }else
            System.out.println("NÃO NEGATIVO");
    }
}
