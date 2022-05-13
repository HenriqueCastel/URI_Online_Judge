import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int cont= 0;
        for(int i= 0; i < 6; i++) {
            double n= t.nextDouble();
            if(n > 0) {
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");
        t.close();
    }
 
}
