import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner t= new Scanner(System.in);
		int c, i, j, n, x;
		c= t.nextInt();
		for(i= 0; i < c; i++) {
			n= t.nextInt();
			x= 0;
			for(j= 0; j < n; j++) {
				if(j % 2 == 0) {
					x++;
				}else {
					x--;
				}
			}
			System.out.println(x);
		}
    }
	
}
