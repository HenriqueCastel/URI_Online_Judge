import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		int a, b;
		double c, res;
		Scanner t= new Scanner(System.in);
		a= t.nextInt();
		b= t.nextInt();
		c= t.nextDouble();
		res= b * c;
		a= t.nextInt();
		b= t.nextInt();
		c= t.nextDouble();
		res += b * c;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", res);
		t.close();
	}

}
