package secao6.exercicios.exercicios1;

import java.util.Scanner;

public class PostoGasolina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("""
                Escolha o combustível:
                1.Álcool
                2.Gasolina
                3.Diesel
                4.Fim
                """);
        Integer opcao = in.nextInt();

        while (opcao != 4){
            switch (opcao){
                case 1:
                    System.out.println("Álcool selecionado!");
                    alcool ++;
                    opcao = in.nextInt();
                    break;
                case 2:
                    System.out.println("Gasolina selecionada!");
                    gasolina ++;
                    opcao = in.nextInt();
                    break;
                case 3:
                    System.out.println("Diesel selecionado!");
                    diesel ++;
                    opcao = in.nextInt();
                    break;

                default:
                    System.out.println("Escolha uma opção válida:");
                    opcao = in.nextInt();;
            }
        }

        System.out.println("""
                MUITO OBRIGADA!
                Álcool: %d
                Gasolina: %d
                Diesel: %d
                """.formatted(alcool,gasolina,diesel));

    }
}
