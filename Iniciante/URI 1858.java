import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int T, menor = 0, posMenor = 0;
		for (int i = 1; i <= N; i++) {
			T = leitor.nextInt();
			if (i == 1) {
				posMenor = 1;
				menor = T;
			} else if (T < menor) {
				posMenor = i;
				menor = T;
			}
		}
		System.out.println(posMenor);
    }
	
}
