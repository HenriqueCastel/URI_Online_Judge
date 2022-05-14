import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		double A, B, C;
		Scanner t= new Scanner(System.in);
		A= t.nextDouble();
		B= t.nextDouble();
		C= t.nextDouble();
		double tempA= Math.max(A, Math.max(B, C));
		double tempB= 0;
		double tempC= 0;
		
		if (tempA == A) {
			tempB= Math.max(B, C);
			tempC= Math.min(B, C);
		}
		if (tempA == B) {
			tempB =Math.max(A, C);
			tempC =Math.min(A, C);
		}
		if (tempA == C) {
			tempB= Math.max(B, A);
			tempC= Math.min(B, A);
		}
		if (tempA >= (tempB + tempC)) {
			System.out.print("NAO FORMA TRIANGULO\n");
		}else {
			if (tempA*tempA > ((tempB*tempB)+(tempC*tempC))) {
				System.out.print("TRIANGULO OBTUSANGULO\n");
			}	
		}
		if (tempA*tempA == ((tempB*tempB)+(tempC*tempC))) {
			System.out.print("TRIANGULO RETANGULO\n");
		}
		if (tempA*tempA < ((tempB*tempB)+(tempC*tempC))) {
			System.out.print("TRIANGULO ACUTANGULO\n");
		}
		if ((tempA == tempB) &&(tempA == tempC)) {
			System.out.print("TRIANGULO EQUILATERO\n");
		}
		if (((tempA == tempB) &&(tempA != tempC)) || ((tempA == tempC) && 
				(tempA != tempB)) || ((tempB == tempC) && (tempB != tempA)) ) {
			System.out.print("TRIANGULO ISOSCELES\n");
		}
	}
	
}
