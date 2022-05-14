import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner t= new Scanner(System.in);
        int x= t.nextInt();
        int cont= 0;
        while (cont < 6) {
        	if (x % 2 == 1) {
        		System.out.println(x);
        		cont++;
        	}
    		x++;
        }
    }
	
}
