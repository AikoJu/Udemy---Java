package secao6.exercicios.exercicios1;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite as duas coordenadas");
        int x = in.nextInt();
        int y = in.nextInt();

        while (x != 0 && y != 0 ){
            if (x > 0 && y > 0 ) {
                System.out.println("primeiro");
                x = in.nextInt();
                y = in.nextInt();
            }
            else if (x < 0 && y > 0 ) {
                System.out.println("segundo");
                x = in.nextInt();
                y = in.nextInt();
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
                x = in.nextInt();
                y = in.nextInt();
            }else {
                System.out.println("quarto");
                x = in.nextInt();
                y = in.nextInt();
            }
        }
    }
}
