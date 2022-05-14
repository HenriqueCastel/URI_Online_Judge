import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner t= new Scanner(System.in);
		int t1, t2, t3, t4, totalTomadas;
    	t1= t.nextInt();
		t2= t.nextInt();
		t3= t.nextInt();
		t4= t.nextInt();
		totalTomadas= (t1 + t2 + t3 + t4) - 3;
		System.out.println(totalTomadas);
    }
	
}
