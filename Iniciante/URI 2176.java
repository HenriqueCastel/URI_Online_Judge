import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
    	String S = leitor.next();
    	String[] bits = S.split("");
    	int x = 0;
    	for(String bit : bits) {
    		if (bit.equals("1")) x++;
    	}
    	S += x % 2 == 0 ? 0 : 1; 
    	System.out.println(S);
    }
}
