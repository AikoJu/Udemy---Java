package secao6.atividades;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        Integer num = in.nextInt();
        if (num > 1 || num <= 1000){
            for (int i = 0; i < num; i++){
                if (i % 2 != 0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Número inválido!");
        }
    }
}
