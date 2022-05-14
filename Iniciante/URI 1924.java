import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {

	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(leitor.readLine());
		String curso;
		for (int i = 0; i < N; i++) {
			curso = leitor.readLine();
		}
		System.out.println("Ciencia da Computacao");
    }
	
}
