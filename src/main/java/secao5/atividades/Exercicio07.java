package secao5.atividades;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite x e y:");
        Double x = in.nextDouble();
        Double y = in.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0 ) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }else {
            System.out.println("Q4");
        }



    }
}
