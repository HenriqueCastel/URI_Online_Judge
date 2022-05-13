import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int[][] C = new int[N+1][N+1];
    	
    	for (int i = 0; i < C.length; i++) {
    		for (int j = 0; j < C[i].length; j++) {
    			C[i][j] = leitor.nextInt();
    		}
    	}
    	
    	for (int i = 0; i < N; i++) {
    		for (int j = 0; j < N; j++) {
    			if (isSafeZone(C, i, j)) System.out.print("S");
    			else System.out.print("U");
    		}
    		System.out.println("");
    	}
    }
    
    private static boolean isSafeZone(int[][] mat, int i, int j) {
    	int cont = 0;
    	
    	if (mat[i][j] == 1) cont++;
    	if (mat[i+1][j] == 1) cont++;
    	if (mat[i][j+1] == 1) cont++;
    	if (mat[i+1][j+1] == 1) cont++;
    	    	
    	if (cont > 1) return true;
    	else return false;
    }
	
}
