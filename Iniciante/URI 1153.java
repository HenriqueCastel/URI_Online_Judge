import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {

		int n, i, fact = 1;
		Scanner t= new Scanner(System.in);
		n= t.nextInt();
		for (i= 1; i <= n; i++) {
			fact *= i;
		}
		System.out.print(fact + "\n");

	}

}
