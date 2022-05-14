import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);
        int numero, i, flag;
        String corvo;
        for(i= 0; i < 3; i++) {
        	numero= 0;
        	flag= 0;
        	while(flag == 0) {
        		corvo= t.nextLine();
        		switch(corvo) {
	        		case "--*": numero += 1; break;
	        		case "-*-": numero += 2; break;
	        		case "-**": numero += 3; break;
	        		case "*--": numero += 4; break;
	        		case "*-*": numero += 5; break;
	        		case "**-": numero += 6; break;
	        		case "***": numero += 7; break;
	        		default: flag= 1; break;
        		}
        	}
        	System.out.println(numero);
        }
    }
	
}
