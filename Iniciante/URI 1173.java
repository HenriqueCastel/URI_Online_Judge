import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n[]= new int[10];
        n[0]= t.nextInt();
        for(int i= 1; i < 10; i++) {
            n[i]= n[i - 1] * 2;
        }
        for(int i= 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }
        t.close();
    }
 
}
