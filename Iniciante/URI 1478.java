import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner t= new Scanner(System.in);
    	int n, x, i, j;
    	n= t.nextInt();
    	while (n != 0) {
    		for (i= 1; i <= n; i++) {
    			x= i;
    			for (j= 1; j <= n; j++) {
    				if (i == j) {
    					x = 1;
    				}
                    System.out.printf("%3d", x);
                    if (j < n) {
                    	System.out.print(" ");
                    }else {
                    	System.out.print("\n");
                    }
    				if (j >= i) {
    					x++;
    				}else {
    					x--;
    				}
    			}
    		}
    		System.out.printf("\n");
    		n= t.nextInt();
    	}
    }
	
}
