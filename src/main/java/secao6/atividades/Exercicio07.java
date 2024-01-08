package secao6.atividades;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer num = in.nextInt();

        for (int i = 1; i <= num; i ++){
            Integer quadrado = i * i;
            Integer cubo = i * i * i;
            System.out.println("""
                                %d  %d  %d""".formatted(i, quadrado, cubo));
        }
    }
}
