import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner t= new Scanner(System.in);
    	int n, i, j;
        while(t.hasNext()) {
        	n= t.nextInt();
    		for(i= 0; i < n; i++) {
    			for(j= 0; j < n; j++) {
    				if(j == n - i - 1) {
    					System.out.print(2);
    				}else {
    					if (i == j) {
    						System.out.print(1);
    					}else {
    						System.out.print(3);
    					}
    				}
    			}
    			System.out.print("\n");
    		}
    	}
    }
	
}
