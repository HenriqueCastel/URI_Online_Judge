import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double X = leitor.nextDouble();
        double[] N = new double[100];
        N[0] = X;
        for (int i = 1; i < N.length; i++) {
        	N[i] = N[i - 1] / 2.0000;
        }
        for (int i = 0; i < N.length; i++) {
        	System.out.println(String.format("N[" + i + "] = %.4f", N[i]));
        }
    }
	
}
