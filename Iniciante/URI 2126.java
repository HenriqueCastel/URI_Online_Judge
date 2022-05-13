import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);
    	int caso = 1, cont = 0, pos = 0, flag = 0;
    	String N1, N2;
    	while (leitor.hasNext()) {
    		cont = 0;
    		N1 = leitor.next();
    		N2 = leitor.next();
    		System.out.println("Caso #" + caso + ":");
    		
    		for (int i = 0; i < N2.length(); i++) {
    			if (N1.charAt(0) == N2.charAt(i)) {
    				flag = 0;
    				for (int j = 0; j < N1.length(); j++) {
    					if (i+j >= N2.length()) break;
    					if (N1.charAt(j) == N2.charAt(i+j)) flag++;
    				}
    				if (flag == N1.length()) {
    					cont++;
    					pos = i+1;
    				}
    			}
    		}
    		
    		if (cont == 0) {
    			System.out.println("Nao existe subsequencia");
    		} else {
    			System.out.println("Qtd.Subsequencias: " + cont );
    			System.out.println("Pos: " + pos);
    		}
    		
    		System.out.println("");
    		caso++;
    	}
    }
	
}
