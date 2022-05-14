import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner t= new Scanner(System.in);
		int valor1, valor2, produto;
		valor1= t.nextInt();
		valor2= t.nextInt();
		produto= valor1 * valor2;
		System.out.println("PROD = " + produto);
		t.close();
 
    }
 
}
