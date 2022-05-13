import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner leitor = new Scanner(System.in);
    	String N = String.valueOf(leitor.nextLong());
    	String invertido = "";
    	for (int i = 0; i < N.length(); i++) {
    		invertido += N.charAt(N.length()-i-1);
    	}
    	System.out.println(invertido);
    }
    public static void Main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	String N = String.valueOf(leitor.nextLong());
    	StringBuilder sb = new StringBuilder(N);
    	String invertido = String.valueOf(sb.reverse());
    	System.out.println(invertido);
    }

}
