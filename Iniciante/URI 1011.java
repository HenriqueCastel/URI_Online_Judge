import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		double a;
		Scanner t = new Scanner(System.in);
		a = t.nextDouble();
		System.out.printf("VOLUME = %.3f\n", (4 * 3.14159 * Math.pow(a, 3.0)) / 3);
		t.close();
	}

}
