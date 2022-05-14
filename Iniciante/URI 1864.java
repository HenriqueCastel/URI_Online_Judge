import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);
		int n= t.nextInt();
		String citacao= "LIFE IS NOT A PROBLEM TO BE SOLVED";
		System.out.println(citacao.substring(0, n));
    }
	
}
