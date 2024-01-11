package secao8.triangulo;

public class Triangulo {
    public Double a;
    public Double b;
    public Double c;

    public Double calculoP(){
        Double p = (a + b + c) / 2;
        return p;
    }

    public Double calcularArea(){
        Double p = calculoP();
        Double area = Math.sqrt(p * (p - a) * (p - b)*(p - c));
        return area;
    }

    public void exibirResultado(){
        Double area = calcularArea();
        System.out.println("""
                Área do triângulo: %.4f%n""".formatted(area));
    }

}
