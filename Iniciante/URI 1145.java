import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int x, y;
        x= t.nextInt();
        y= t.nextInt();
        for(int i= 1; i <= y; i++) {
            System.out.print(i);
            if(i % x == 0) {
                System.out.println("");
            }else {
                System.out.print(" ");
            }
        }
        t.close();
    }
 
}
