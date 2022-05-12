import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int votos = 0;
			for (int i = 0; i < N; i++) 
				votos += leitor.nextInt();
			double doisTercos = (2.0 * N) / 3.0;
			if (votos >= doisTercos)
				System.out.println("impeachment");
			else
				System.out.println("acusacao arquivada");
		}
	}
	
}
