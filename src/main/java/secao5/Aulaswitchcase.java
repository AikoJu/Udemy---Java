package secao5;

import java.util.Scanner;

public class Aulaswitchcase {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabádo";
                break;

            default:
                dia = "Valor inválido!";
                break;

        }

        System.out.println("Dia da semana: " + dia);
    }
}
