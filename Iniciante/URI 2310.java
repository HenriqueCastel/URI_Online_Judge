import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int[] dados = new int[6];
		for (int i = 0; i < N; i++) {
			leitor.next();
			for (int j = 0; j < dados.length; j++) {
				dados[j] += leitor.nextInt();
			}
		}
		double bloqueios = (dados[3] * 100.0) / dados[0];
		double saques = (dados[4] * 100.0) / dados[1];
		double ataques = (dados[5] * 100.0) / dados[2];
		System.out.println(String.format("Pontos de Saque: %.2f", bloqueios) + " %.");
		System.out.println(String.format("Pontos de Bloqueio: %.2f", saques) + " %.");
		System.out.println(String.format("Pontos de Ataque: %.2f", ataques) + " %.");
	}
	
}
