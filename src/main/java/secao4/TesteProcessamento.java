package secao4;

public class TesteProcessamento {
    public static void main(String[] args) {
        int x , a,c;
        double resultado ,y, b,B,h, area;
        a = 5;
        c = 2;
        x = 5;
        y = 2 * x;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        resultado = (double) a / c;

        System.out.println(x +" "+ y + "\n" + area  + "\n" + resultado);
    }
}
