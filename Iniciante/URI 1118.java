import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);
		double nota1, nota2, flag = 1;
		while (flag == 1) {	
			nota1= t.nextDouble();
			while (nota1 > 10 || nota1 < 0) {
				System.out.println("nota invalida");
				nota1= t.nextDouble();
			}
			nota2= t.nextDouble();
			while (nota2 > 10 || nota2 < 0) {
				System.out.println("nota invalida");
				nota2= t.nextDouble();
			}
			double media= (nota1 + nota2) / 2;
			System.out.println(String.format("media = %.2f", media));
			System.out.println("novo calculo (1-sim 2-nao)");
			flag= t.nextInt();
			while (flag != 1 && flag != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				flag= t.nextInt();
			}
		}
    }
	
}
