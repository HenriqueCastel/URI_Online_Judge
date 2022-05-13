import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int x, y;
        do {
            x= t.nextInt();
            y= t.nextInt();
            if(x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            if(x < 0 && y > 0) {
                System.out.println("segundo");
            }
            if(x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            if(x > 0 && y < 0) {
                System.out.println("quarto");
            }
        }while(x != 0 && y != 0);
        t.close();
    }
 
}
