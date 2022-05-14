import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner t= new Scanner(System.in);
        int a, n, i, soma= 0; 
        a= t.nextInt();
        n= t.nextInt();
        while (n <= 0) {
        	n= t.nextInt();
        }
        for (i= 0; i <= n - 1; i++) {
        	soma= soma + i + a;
        }
        System.out.println(soma);
        t.close();
    }
	
}
