import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n= t.nextInt();
        for(int i= 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println(i + "^2 = " + i * i);
            }
        }
        t.close();
    }
 
}
