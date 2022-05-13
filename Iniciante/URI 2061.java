import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int M = leitor.nextInt();
    	String acao;
    	for (int i = 0; i < M; i++) {
    		acao = leitor.next();
    		if (acao.equalsIgnoreCase("fechou")) N++;
    		else N--;
    	}
    	System.out.println(N);
    }
	
}
