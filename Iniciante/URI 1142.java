import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n, cont= 0; 
        n= t.nextInt();
        for(int i= 1; i <= n; i++) {
            for(int j= 1; j <= 3; j++) {
                cont++;
                System.out.print(cont + " ");
            }
            System.out.println("PUM");
            cont++;
        }
        t.close();
    }
 
}
