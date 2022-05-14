import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {		
    	Scanner t= new Scanner(System.in);
    	int A, B, C, D, diferenca;
    	A= t.nextInt();
    	B= t.nextInt();
    	C= t.nextInt();
    	D= t.nextInt();
    	diferenca= (A * B - C * D);
    	System.out.println("DIFERENCA = " + diferenca);
    	t.close();
    }
 
}
