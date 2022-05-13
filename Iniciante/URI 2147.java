import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int C = leitor.nextInt();
    	double T;
    	String palavra;
    	for (int i = 0; i < C; i++) {
    		palavra = leitor.next();
    		T = 0.01 * palavra.length();
    		System.out.println(String.format("%.2f", T));
    	}
    }
	
}
