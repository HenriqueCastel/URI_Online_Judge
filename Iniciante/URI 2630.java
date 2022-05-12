import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		int T = leitor.nextInt();
		for (int i = 1; i <= T; i++) {
			String option = leitor.next();
			int R = leitor.nextInt();
			int G = leitor.nextInt();
			int B = leitor.nextInt();
			int answer;
			
			if (option.equalsIgnoreCase("mean")) answer = getMean(R, G, B);
			else if (option.equalsIgnoreCase("eye")) answer = getEye(R, G, B);
			else if (option.equalsIgnoreCase("min")) answer = getMin(R, G, B);
			else if (option.equalsIgnoreCase("max")) answer = getMax(R, G, B);
			else answer = -1;
			
			System.out.println(String.format("Caso #%d: %d", i, answer));
		}
	}
	
	private static int getMean(int a, int b, int c) {
		return (a + b + c) / 3;
	}
	
	private static int getEye(int a, int b, int c) {
		return (int) ((a * 0.30) + (0.59 * b) + (0.11 * c));
	}
	
	private static int getMin(int a, int b, int c) {
		if (a < b && a < c) return a;
		if (b < c) return b;
		else return c;
	}

	private static int getMax(int a, int b, int c) {
		if (a > b && a > c) return a;
		if (b > c) return b;
		else return c;
	}
	
}
