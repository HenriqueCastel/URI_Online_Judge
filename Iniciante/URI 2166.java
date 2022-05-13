import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
    	double N = leitor.nextInt();
        double x = 0.0;
    	for (int i = 0; i < N; i++) {
            x += 2.0;
            x = (1.0 / x);
    	}
        x += 1.0;
    	System.out.println(String.format("%.10f", x));
    }
	
}
