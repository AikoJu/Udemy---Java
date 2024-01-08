package secao6.atividades;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer num = in.nextInt();

        for (int i = 1; i <= num; i++){

            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
}
