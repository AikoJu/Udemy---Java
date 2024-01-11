package secao6.exercicios.exercicios1;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a senha:");
        int senhaDigitada = in.nextInt();

        while (senhaDigitada != 2002){
            System.out.println("Senha inválida!\n ");
            senhaDigitada = in.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
