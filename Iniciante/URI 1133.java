import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int x, y;
        x= t.nextInt();
        y= t.nextInt();
        if(x > y) {
            for(int i= y + 1; i < x; i++) {
                if(i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        }else {
            for(int i= x + 1; i < y; i++) {
                if(i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        }
        t.close();
    }
 
}
