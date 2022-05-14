import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner t= new Scanner(System.in);
        int a= t.nextInt();
        int b= t.nextInt();
        int q, r;
        if(a >= 0) {
        	q= a / b;
        	r= a % b;	
        } else {
        	int x = 0, y = 0;
        	if (b < 0) {
        		x = b * -1;
        	}else {
        		x = b;
        	}
        	for(r= 0; r < x; r++) {
        		y= a - r;
        		if(y % b == 0) {
        			break;
        		}
        	}
        	q= y / b;
        }
        System.out.println(q + " " + r);
    }
	
}
