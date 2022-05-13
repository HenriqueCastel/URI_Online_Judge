import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int n, x, i, soma= 0, somaC= 0, somaR= 0, somaS= 0;
		double perC= 0, perR= 0, perS= 0;
		String animal;
		Scanner t= new Scanner(System.in);
		n= t.nextInt();
		for (i= 0; i < n; i++) {
			x= t.nextInt();
			animal= t.next();
			soma += x;
			if (animal.equals("C")) {
				somaC += x;
			}
			if(animal.equals("R")){
				somaR += x;
			}
			if(animal.equals("S")){
				somaS += x;
			}
			perC= (somaC * 100.00) / soma;
			perR= (somaR * 100.00) / soma;
			perS= (somaS * 100.00) / soma;
		}
		System.out.println("Total: " + soma + " cobaias");
		System.out.println("Total de coelhos: " + somaC);
		System.out.println("Total de ratos: " + somaR);
		System.out.println("Total de sapos: " + somaS);
		System.out.printf("Percentual de coelhos: %.2f", perC);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", perR);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", perS);
		System.out.print(" %\n");
		t.close();
	}
}
