import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
        String nome = t.next();
	    double salarioFixo = t.nextDouble();
	    double vendas = t.nextDouble();
		double total = ((vendas * 15) / 100) + salarioFixo;
		System.out.println(String.format("TOTAL = R$ %.2f" , total));
	    t.close();
	}
}
