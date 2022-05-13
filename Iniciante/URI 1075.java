import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n= t.nextInt();
        for(int i= 1; i <= 10000; i++) {
            if(i % n == 2) {
                System.out.println(i);
            }
        }
        t.close();
    }
 
}
