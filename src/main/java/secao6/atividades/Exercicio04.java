package secao6.atividades;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite quantas vezes quer fazer a conta:");
        Integer num = in.nextInt();

        for (int i = 0; i < num; i++){
            System.out.println("Digite primeiro o dividendo e depois o divisor: ");
            Integer a = in.nextInt();
            Integer b = in.nextInt();

            if (b != 0){
                Double resultado = (double) (a / b);
                System.out.println(resultado);
            }else{
                System.out.println("Divisão impossivel");
            }

        }

    }
}
