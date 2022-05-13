import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();
		if (!isValidTriangle(A, B, C)) {
			System.out.println("Invalido");
		} else {
			if (A == B && A == C && B == C) 
				System.out.println("Valido-Equilatero");
			else if (A == B || A == C || B == C)
				System.out.println("Valido-Isoceles");
			else 
				System.out.println("Valido-Escaleno");
		
			if (isRectangleTriangle(A, B, C)) 
				System.out.println("Retangulo: S");
			else 
				System.out.println("Retangulo: N");
		}
	}
	
	private static boolean isValidTriangle(int A, int B, int C) {
		double maior;
		double soma;
		boolean triangulo;
		
		if (A > B && A > C) maior = A;
		else if (B > C) maior = B;
		else maior = C;

		if (maior == A) soma = B + C;
		else if (maior == B) soma = A + C;
		else soma = B + A;
		
		if (soma > maior) triangulo = true;
		else triangulo = false;
		
		return triangulo;
	}
	
	private static boolean isRectangleTriangle(int A, int B, int C) {
		int aA = A * A;
		int bB = B * B;
		int cC = C * C;
		return aA + bB == cC || aA + cC == bB || cC + bB == aA;
	}
	
}
