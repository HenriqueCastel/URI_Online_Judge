import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		float A, B, C, areaTraphisium, perimeterTriangle ;	
		Scanner t= new Scanner(System.in);
		A= t.nextFloat();
		B= t.nextFloat();
		C= t.nextFloat();
		if ((A < (float)(B+C)) && (B < (float)(A + C)) && (C < (float)(B + A))) {
			perimeterTriangle= A + B + C;
			System.out.printf("Perimetro = %.1f\n", perimeterTriangle);
		}else {
			areaTraphisium= ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n", areaTraphisium);
		}
	}

}
