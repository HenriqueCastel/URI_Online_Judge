import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
		int A, B, SOMA;
		A= t.nextInt();
		B= t.nextInt();
		SOMA= A + B;
		System.out.println("SOMA = " + SOMA);
		t.close();
 
    }
 
}
