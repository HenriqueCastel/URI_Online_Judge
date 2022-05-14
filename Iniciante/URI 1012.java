import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        double a = t.nextDouble();
        double b = t.nextDouble();
        double c = t.nextDouble();
        double triangulo = a * c / 2.0;
        double circulo = 3.14159 * (c * c);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));  
        t.close();
    }
	
}
