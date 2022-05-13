import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner t= new Scanner(System.in);
       int n, cedulas, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
       n= t.nextInt();
       cedulas= n;
       nota100= cedulas / 100;
       cedulas -= nota100 * 100;
       nota50= cedulas / 50;
       cedulas -= nota50 * 50;
       nota20= cedulas / 20;
       cedulas -= nota20 * 20;
       nota10= cedulas / 10;
       cedulas -= nota10 * 10;
       nota5= cedulas / 5;
       cedulas -= nota5 * 5;
       nota2= cedulas / 2;
       cedulas -= nota2 * 2;
       nota1= cedulas;
       System.out.println(n);
       System.out.println(nota100 + " nota(s) de R$ 100,00");
       System.out.println(nota50 + " nota(s) de R$ 50,00");
       System.out.println(nota20 + " nota(s) de R$ 20,00");
       System.out.println(nota10 + " nota(s) de R$ 10,00");
       System.out.println(nota5 + " nota(s) de R$ 5,00");
       System.out.println(nota2 + " nota(s) de R$ 2,00");
       System.out.println(nota1 + " nota(s) de R$ 1,00");
       t.close(); 
    }
 
}
