import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		int N, X, Y, j, total;
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		
		for (int i = 1; i <= N; i++) {
			int sum = 0;
			X = input.nextInt();
			Y = input.nextInt();
			for (j = X,total = 0; total < Y; j++) {
				if (j % 2 != 0) {
					sum += j;
					total += 1;
				}
			}
			System.out.print(sum+"\n");
		}

	}

}
