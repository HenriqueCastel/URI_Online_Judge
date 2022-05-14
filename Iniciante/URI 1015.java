import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		double x1, x2, y1, y2, dist;
		Scanner t= new Scanner(System.in);
		x1= t.nextDouble();
		y1= t.nextDouble();
		x2= t.nextDouble();
		y2= t.nextDouble();
		dist= Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("%.4f\n", dist);
		t.close();
	}

}
