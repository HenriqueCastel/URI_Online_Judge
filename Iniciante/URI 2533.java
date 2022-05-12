import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int M = leitor.nextInt();
			int totalC = 0;
			int totalNC = 0;
			for (int i = 0; i < M; i++) {
				double N = leitor.nextInt();
				double C = leitor.nextInt();
				totalNC += N * C;
				totalC += C;
			}
			double resultado = totalNC / (totalC * 100.0);
			System.out.println(String.format("%.4f", resultado));
		}
	}
	
}
