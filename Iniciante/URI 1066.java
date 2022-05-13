import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int x, contPar= 0, contImpar= 0, contPositivo= 0, contNegativo= 0;
        for(int i= 0; i < 5; i++) {
            x= t.nextInt();
            if(x % 2 == 0) {
                contPar++;
            }
            if(x % 2 != 0) {
                contImpar++;
            }
            if(x > 0) {
                contPositivo++;
            }
            if(x < 0) {
                contNegativo++;
            }
        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivo + " valor(es) positivo(s)");
        System.out.println(contNegativo + " valor(es) negativo(s)");
        t.close();
    }
 
}
