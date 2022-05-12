import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int M = leitor.nextInt();
			int[][] mat = new int[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					mat[i][j] = leitor.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (mat[i][j] == 1) System.out.print("9");
					else System.out.print(a(mat, i, j));
				}
				System.out.print("\n");
			}
		}
	}
	
	private static int a(int[][] mat, int i, int j) {
		int p = 0;
		int l = mat.length -1;
		int c = mat[i].length - 1;
		if (i > 0 && mat[i - 1][j] == 1) p++;
		if (i < l && mat[i + 1][j] == 1) p++;
		if (j > 0 && mat[i][j - 1] == 1) p++;
		if (j < c && mat[i][j + 1] == 1) p++;
		return p;
	}
	
}
