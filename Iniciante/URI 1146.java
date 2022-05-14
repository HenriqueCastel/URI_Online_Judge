import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);
		int x, i;
		x= t.nextInt();
		while(x != 0) {
			for(i= 1; i <= x; i++) {
				if(i == x) {
					System.out.println(i + "");
				}else {
					System.out.print(i + " ");
				}
			}
			x= t.nextInt();
		}
		t.close();
	}
	
}
