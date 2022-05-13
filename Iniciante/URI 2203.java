import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
    	int Xf, Yf, Xi, Yi, Vi, R1, R2;
    	double D1, D2;
    	while (leitor.hasNext()) {
    		Xf = leitor.nextInt();
    		Yf = leitor.nextInt();
    		Xi = leitor.nextInt();
    		Yi = leitor.nextInt();
    		Vi = leitor.nextInt();
    		R1 = leitor.nextInt();
    		R2 = leitor.nextInt();
    		D1 = Math.sqrt(Math.pow(Xi - Xf, 2.0) + Math.pow(Yi - Yf, 2.0)) + (Vi * 1.50);
    		D2 = R1 + R2;
    		if (D1 > D2) System.out.println("N");
    		else System.out.println("Y");
    	}
    }
	
}
