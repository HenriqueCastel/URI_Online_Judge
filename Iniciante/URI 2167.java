import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int[] R = new int[N];
    	int queda = 0;
    	for (int i = 0; i < N; i++) {
    		R[i] = leitor.nextInt();
    	}
    	for (int i = 0; i < N-1; i++) {
    		if (R[i] > R[i+1]) {
    			queda = i+2;
    			break;
    		}
    	}
    	System.out.println(queda);
    }
	
}
