import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n, cont= 0;
        for(int i= 0; i < 5; i++) {
            n= t.nextInt();
            if(n % 2 == 0){
                cont++;
            }
        }
        System.out.println(cont + " valores pares");
        t.close();
    }
 
}
