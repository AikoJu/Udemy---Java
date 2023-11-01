package secao5.atividades;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valor;

        System.out.println("Digite o código e a quantidade do produto:");
        int codigo = in.nextInt();
        int quantidade = in.nextInt();

        if (codigo == 1){
            valor = quantidade * 4.00;
        } else if (codigo == 2) {
            valor = quantidade * 4.50;
        } else if (codigo == 3) {
            valor = quantidade * 5.00;
        }else if (codigo == 4){
            valor = quantidade * 2.00;
        }else{
            valor = quantidade * 1.50;
        }

        System.out.println(String.format("Total: R$%.2f",valor));

    }
}
