import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner t = new Scanner(System.in);
        int N, centro, interior, exterior;
        while (t.hasNext()) {
        	N = t.nextInt();
        	centro = N / 2;
        	interior = N / 3;
        	exterior = (N - 1) - interior;
        	for (int i = 0; i < N; i++) {
        		for (int j = 0; j < N; j++) {
        			if (i == centro && j == centro) System.out.print(4);
        			else if (i >= interior && j >= interior && i <= exterior && j <= exterior) System.out.print(1);
        			else if (i == j) System.out.print(2);
        			else if (j == N-i-1) System.out.print(3);
        			else System.out.print(0);
        		}
        		System.out.print("\n");
        	}
    		System.out.print("\n");
        }
        t.close();
	}
	
}
