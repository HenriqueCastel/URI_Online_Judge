import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int x, y;
        do {
            x= t.nextInt();
            y= t.nextInt();
            if(x > y) {
                System.out.println("Decrescente");
            }
            if(y > x) {
                System.out.println("Crescente");
            }
        }while(x != y);
        t.close();
    }
 
}
