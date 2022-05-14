import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		int T, i, j;
		int N[]= new int[1000];
		Scanner t= new Scanner(System.in);
		T= t.nextInt();
		for(i= 0, j= 0; i < 1000; j++, i++) {
			N[j]= j;
			if ((N[j]) == T) {
				j= 0;
			}
			System.out.print("N[" + i + "] = " + N[j] + "\n");
		}
	}
}
