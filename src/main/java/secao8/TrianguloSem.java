package secao8;

import java.util.Locale;
import java.util.Scanner;

public class TrianguloSem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite os lados do triângulo X");
        Double x1 = in.nextDouble();
        Double x2 = in.nextDouble();
        Double x3 = in.nextDouble();

        System.out.println("Digite os lados do triângulo Y");
        Double y1 = in.nextDouble();
        Double y2 = in.nextDouble();
        Double y3 = in.nextDouble();

        Double pX = (x1 + x2 + x3) / 2;
        Double areaX = Math.sqrt( pX * (pX - x1) * (pX - x2)*(pX - x3));

        Double pY = (y1 + y2 + y3) / 2;
        Double areaY = Math.sqrt( pY * (pY - y1) * (pY - y2)*(pY - y3));

        System.out.println("""
                Área do triângulo X: %.4f%n
                Área do triângulo Y: %.4f%n3.0""".formatted(areaX,areaY));
        if (areaX > areaY){
            System.out.println("O triângulo X possui a maior área ");
        }else {
            System.out.println("O triângulo Y possui a maior área ");
        }
    }
}
