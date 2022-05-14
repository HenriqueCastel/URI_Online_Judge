import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);
		double pi= 3.14159;
		double raio= t.nextDouble();
		double area= pi * Math.pow(raio, 2);
		System.out.printf("A=%.4f", area);
		System.out.println();
	}
}

