import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner t = new Scanner(System.in);
    	int N = t.nextInt();
    	int T, anos;
    	for (int i = 0; i < N; i++) {
    		T = t.nextInt();
    		if (T >= 2015) {
    			anos = T - 2014;
    			System.out.println(anos + " A.C.");
    		} else {
    			anos = 2015 - T;
    			System.out.println(anos + " D.C.");
    		}
    	}
    }
	
}
