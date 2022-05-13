import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner t= new Scanner(System.in);
    	int p, n, i;
    	p= t.nextInt();
    	n= t.nextInt();
    	int pulos[]= new int[n];
    	boolean WIN= true;
    	for(i= 0; i < n; i++) {
    		pulos[i]= t.nextInt();
    	}
    	for(i= 0; i < (n - 1); i++) {
    		if((pulos[i] - pulos[i+1]) < (-p)) {
    			WIN= false;
    		}else {
    			if ((pulos[i] - pulos[i+1]) > p) {
    				WIN = false; 
    			}
    		}
    	}
    	if(WIN) {
    		System.out.println("YOU WIN");
    	}else {
    		System.out.println("GAME OVER");
    	}
    }
	
}
