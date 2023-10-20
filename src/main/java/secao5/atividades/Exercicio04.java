package secao5.atividades;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio, fim, tempo;

        System.out.println("Digite a hora de início e fim do jogo");
        inicio = in.nextInt();
        fim = in.nextInt();

        if(inicio < fim){
            tempo = fim - inicio;
        }else{
            tempo = 24  - inicio + fim;
        }

        System.out.println(String.format("O JOGO DUROU %d HORAS",tempo));
    }
}
