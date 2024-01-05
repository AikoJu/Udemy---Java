package secao6;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer soma = 0;
        Integer menos = 100;

        for (int i = 0; i < 3; i++ ){
            Integer num =  in.nextInt();
            soma += num;
        }

        for (int i = 5; i > 0; i--){
            Integer num = in.nextInt();
            menos -= num;
        }
        System.out.println("Resultados finais: " + soma + menos);
    }
}
