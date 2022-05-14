import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner t= new Scanner(System.in);
        double A, B, C, X;
        while ((A= t.nextInt()) != 0) {
        	B= t.nextInt();
        	C= t.nextInt();
        	X= Math.sqrt((((A * B) / C) * 100.0));
        	System.out.println((int)X);
        }
    }
	
}
