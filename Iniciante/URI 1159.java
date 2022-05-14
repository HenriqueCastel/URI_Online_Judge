import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		int n;
		Scanner t= new Scanner(System.in);
		while ((n= t.nextInt()) != 0) {
			int soma= 0;
			for (int i= n, k= 1; k <= 5; i++) {
				if (i % 2 == 0) {
					soma += i;
					k += 1;
				}
			}
			System.out.print(soma + "\n");
		}

	}

}
