import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);
		int n, i; 
		double x, y, divisao;
		n= t.nextInt();
		for(i= 0; i < n; i++) {
			x= t.nextInt();
			y= t.nextInt();
			if(y == 0) {
				System.out.println("divisao impossivel");
			}else {
				divisao= x / y;
				System.out.println(divisao);
			}
		}
		t.close();
	}

}
