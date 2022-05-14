import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner sc= new Scanner(System.in);
	    Scanner n= new Scanner(System.in);
	    String input;
	    int counter= 0;
	    while(n.hasNextLine()) {
	        input= n.nextLine();
	        char[] charInput= input.toCharArray();
	        if(input.equals("0")) {
	        	System.out.println("vai ter copa!");
	        }else {
	        	System.out.println("vai ter duas!");	    
	        }
	    }
	    sc.close();
	}
}
