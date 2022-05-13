import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n= t.nextInt();
        for(int i= 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + i * n);
        }
        t.close();
    }
 
}
