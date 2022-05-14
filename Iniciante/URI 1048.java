import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);
		double salario, novoSalario, reajuste;
		salario= t.nextDouble();
		if(salario <= 400) {
			novoSalario= salario * 1.15;
			reajuste= salario * 0.15;
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: 15 %");
		}
		if(salario > 400 && salario <= 800) {
			novoSalario= salario * 1.12;
			reajuste= salario * 0.12;
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: 12 %");
		}
		if(salario > 800 && salario <= 1200) {
			novoSalario= salario * 1.10;
			reajuste= salario * 0.10;
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: 10 %");
		}
		if(salario > 1200 && salario <= 2000) {
			novoSalario= salario * 1.07;
			reajuste= salario * 0.07;
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: 7 %");
		}
		if(salario > 2000) {
			novoSalario= salario * 1.04;
			reajuste= salario * 0.04;
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: 4 %");
		}
		t.close();
	}
}
