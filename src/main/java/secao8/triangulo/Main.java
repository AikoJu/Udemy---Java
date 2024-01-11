package secao8.triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Digite os lados do triângulo X");
        x.a = in.nextDouble();
        x.b = in.nextDouble();
        x.c = in.nextDouble();

        System.out.println("Digite os lados do triângulo Y");
        y.a = in.nextDouble();
        y.b = in.nextDouble();
        y.c = in.nextDouble();

        x.exibirResultado();
        y.exibirResultado();

        if (x.calcularArea() > y.calcularArea()){
            System.out.println("O triângulo X possui a maior área ");
        }else {
            System.out.println("O triângulo Y possui a maior área ");
            }
        }
    }
}
