import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		double a, b, r;
		Scanner t= new Scanner(System.in);
		a= t.nextDouble();
		b= t.nextDouble();
		r= (a * b)/12;
		System.out.printf("%.3f\n", r);
		t.close();
	}

}
