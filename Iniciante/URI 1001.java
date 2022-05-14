import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
		int A, B, X;
		A= t.nextInt();
		B= t.nextInt();
		X= A + B;
		System.out.println("X = " + X);
		t.close();
 
    }
 
}
