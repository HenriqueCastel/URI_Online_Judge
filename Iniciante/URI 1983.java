import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner leitor = new Scanner(System.in);	
    	int N = leitor.nextInt();
    	int matricula, matriculaMaiorNota = 0;
    	double nota, maiorNota = 0; 
    	for (int i = 0; i < N; i++) {
    		matricula = leitor.nextInt();
    		nota = leitor.nextDouble();
    		if (nota > maiorNota && nota >= 8) {
    			maiorNota = nota;
    			matriculaMaiorNota = matricula;
    		}
    	}
    	
    	if (maiorNota == 0) System.out.println("Minimum note not reached");
    	else System.out.println(matriculaMaiorNota);
    }
	
}
