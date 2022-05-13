import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
    	int X = leitor.nextInt();
    	double M = leitor.nextDouble();
    	double totalXP;
    	while(M != 0 && X != 0) {
    		totalXP = X * M;
    		System.out.println(String.format("%.0f", totalXP));
    		X = leitor.nextInt();
    		M = leitor.nextDouble();
    	}
    }
	
}
