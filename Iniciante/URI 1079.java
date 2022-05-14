import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		int N;
		float value1, value2, value3;
		float average;
		Scanner t= new Scanner(System.in);
		N= t.nextInt();
		for (int i = 1; i <= N; i++) {
			value1 = t.nextFloat();
			value2 = t.nextFloat();
			value3 = t.nextFloat();
			average = (value1 * 2 + value2 * 3 + value3 * 5 ) / 10;
			System.out.printf("%.1f\n", average);
		}
	}

}
