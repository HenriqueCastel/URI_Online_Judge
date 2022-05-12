import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			double recorde = 0;
			for (int i = 1; i <= N; i++) {
				double T = leitor.nextInt();
				double D = leitor.nextInt();
				if (D / T > recorde) {
					System.out.println(i);
					recorde = D / T;
				}
			}
		}
	}
	
}
