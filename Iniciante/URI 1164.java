import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t = new Scanner(System.in);
        int n, x, soma;
        n =  t.nextInt();
        for(int i = 0; i < n; i++) {
            x = t.nextInt();
            soma = 0;
            for(int j = 1; j < x; j++) {
                if(x % j == 0) {
                    soma += j;
                }
            }
            if(x == soma) {
                System.out.println(x + " eh perfeito");
            }else {
                System.out.println(x + " nao eh perfeito");
            }
        }
        t.close();
    }
 
}
