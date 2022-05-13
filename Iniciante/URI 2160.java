import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
    	String nome = leitor.nextLine();
    	System.out.println(nome.length() > 80 ? "NO" : "YES");
    }
	
}
