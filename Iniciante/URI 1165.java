import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n, x, cont;
        n = t.nextInt();
        for(int i = 0; i < n; i++) {
            x = t.nextInt();
            cont = 0;
            for(int j = 2; j < x; j++) {
                if(x % j == 0) {
                    cont++;
                }
            }
            if(cont == 0) {
                System.out.println(x + " eh primo");
            }else {
                System.out.println(x + " nao eh primo");
            }
        }
        t.close();
    }
    
}
