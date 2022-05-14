import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);
		long n, l, p; 
		n= t.nextLong();
		l= t.nextLong();
		p= n * l;
		System.out.println(p);
    }
	
}
