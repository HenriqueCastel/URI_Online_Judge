import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int D = leitor.nextInt();
			String oficialDate = "Pizza antes de FdI";
			boolean swp = true;
			for (int i = 0; i < D; i++) {
				String date = leitor.next();
				boolean bol = true;
				for (int j = 0; j < N; j++) {
					if (leitor.nextInt() != 1)
						bol = false;
				}
				if (bol && swp) {
					swp = false;
					oficialDate = date;
				}
			}
			System.out.println(oficialDate.trim());
		}
	}
	
}
