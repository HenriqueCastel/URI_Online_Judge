import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		double a, b;
		Scanner t= new Scanner(System.in);
		a= t.nextDouble();
		b= t.nextDouble();
		System.out.printf("%.3f km/l\n", a / b);
		t.close();
	}

}
