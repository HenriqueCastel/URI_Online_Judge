import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
	    int a, b, c, tmp;
		Scanner t = new Scanner(System.in);
		a= t.nextInt();
		b= t.nextInt();
		c= t.nextInt();
		tmp= a;
		if(a < b || a < c){
			if(b < c){
				tmp = c;
			}else{
				tmp = b;
			}
		}
		System.out.printf("%d eh o maior\n", tmp);
		t.close();
	}
	
}
