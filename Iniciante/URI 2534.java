import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int Q = leitor.nextInt();
			int[] notas = new int[N];
			for (int i = 0; i < N; i++) {
				notas[i] = leitor.nextInt();
			}
			quickSort(notas, 0, notas.length-1);
			for (int i = 0; i < Q; i++) {
				int consulta = notas[leitor.nextInt()-1];
				System.out.println(consulta);
			}
		}
	}

	private static void quickSort(int[] v, int inicio, int fim) {
		int aux, down, up, pivo, i;
		pivo = v[inicio];
		down = inicio;
		up = fim;
		while (down < up) {
			while (v[down] >= pivo && down < fim)
				down++;
			while (v[up] < pivo && up > inicio)
				up--;
			if (down < up) {
				aux = v[down];
				v[down] = v[up];
				v[up] = aux;
			}
		}
		
		v[inicio] = v[up];
		v[up] = pivo;

		if (inicio < up && inicio != up - 1)
			quickSort(v, inicio, up - 1);

		if (fim > down && up + 1 != fim)
			quickSort(v, up + 1, fim);
	}
	
}
