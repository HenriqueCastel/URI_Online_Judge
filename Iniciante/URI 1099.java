import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner t= new Scanner(System.in);
    	int n, i, j, x, y, soma= 0;
    	n= t.nextInt();
    	for(i= 0; i < n; i++) {
    		x= t.nextInt();
    		y= t.nextInt();
    		soma= 0;
    		if(x > y) {
    			for(j= y + 1; j < x; j++) {
	    			if(j % 2 != 0) {
	    				soma += j;
	    			}
	    		}
    		}else {
	    		for(j= x + 1; j < y; j++) {
	    			if(j % 2 != 0) {
	    				soma += j;
	    			}
	    		}
    		}
    		System.out.println(soma);
    	}
    	t.close();
    }
	
}
