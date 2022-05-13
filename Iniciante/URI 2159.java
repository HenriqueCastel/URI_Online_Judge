import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner leitor = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.0");
    	long n = leitor.nextLong();
    	double P = n / Math.log(n);
    	double M = 1.25506 * (n / Math.log(n));
    	System.out.println(df.format(P) + " " + df.format(M));
    }
	
}
