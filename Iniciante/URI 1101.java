import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);
		int m, n, soma= 0;
		while((m= t.nextInt()) > 0 && (n= t.nextInt()) > 0) {
			soma= 0;
			if(m > n) {
				for(int i= n; i <= m; i++) {
					soma += i;
					System.out.print(i + " ");
				}
				System.out.print("Sum=" + soma + "\n");
			}else {
				for(int i= m; i <= n; i++) {
					soma += i;
					System.out.print(i + " ");
				}
				System.out.print("Sum=" + soma + "\n");
			}
		}
		t.close();
	}

}
