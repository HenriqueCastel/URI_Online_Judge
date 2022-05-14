import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner t= new Scanner(System.in);
        int x, z, cont= 0, soma= 0;
        x= t.nextInt();
        z= t.nextInt();
        while (z <= x) {
        	z= t.nextInt();
        }
        while (soma < z) {
        	soma += x;
        	cont++;
        	x++;
        }
        System.out.println(cont);
    }
	
}
