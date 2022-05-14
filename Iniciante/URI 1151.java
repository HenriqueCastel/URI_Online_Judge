import java.util.Scanner;
import javax.print.DocFlavor.INPUT_STREAM;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		int n1= 0, n2= 1, n3, i, n; 
	    Scanner t= new Scanner(System.in);
	    n= t.nextInt();
		System.out.print(n1 + " " + n2);  
		for(i= 2; i < n; ++i)  {    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		}    
			System.out.print("\n");
	}

}
