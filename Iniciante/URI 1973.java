import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

     	Scanner leitor = new Scanner(System.in);	
    	int N = leitor.nextInt();
    	int[] estrela = new int[N];
    	int[] carneiro = new int[N];
    	long totalEstrela = 0;
    	long totalCarneiro = 0;
    	
    	for (int i = 0; i < N; i++) {
	    	carneiro[i] = leitor.nextInt();
	    	estrela[i] = 0;
    	}
    	
    	int j = 0;
    	
    	while (true) {
    		if (j == 0 && carneiro[j] % 2 == 0){
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			break;
    		} else if (j == (N-1) && carneiro[j] % 2 == 1) {
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			break;
    		} else if (carneiro[j] % 2 == 1) {
    			if (carneiro[j] > 0) carneiro[j]--;
    			estrela[j] = 1;
    			j++;
    		} else if (carneiro[j] % 2 == 0) {
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			j--;
    		}
    	}
    	
    	for (int i = 0; i < N; i++) {
    		totalCarneiro += carneiro[i];
    		totalEstrela += estrela[i];
    	}
    	
    	System.out.println(totalEstrela + " " + totalCarneiro);
    }
	
}
