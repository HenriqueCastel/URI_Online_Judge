import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner t= new Scanner(System.in);
		int a, b, c;
    	a= t.nextInt();
		b= t.nextInt();
		if(a == b) {
			c= a;
		}else {
			if(a > b) {
				c= a;
			}else {
				c= b;
			}
		}
		System.out.println(c);
    }
	
}
