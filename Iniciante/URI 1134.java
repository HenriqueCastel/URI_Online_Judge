import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n, contA= 0, contG= 0, contD= 0;
        do {
            n= t.nextInt();
            if(n == 1) {
                contA++;
            }
            if(n == 2) {
                contG++;
            }
            if(n == 3) {
                contD++;
            }
        }while(n != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + contA);
        System.out.println("Gasolina: " + contG);
        System.out.println("Diesel: " + contD);
        t.close();
    }
 
}
