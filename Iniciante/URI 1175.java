import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n[]= new int[20];
        int y;
        for(int i= 0; i < n.length; i++) {
            n[i]= t.nextInt();
        }
        for(int i= 0; i < (n.length / 2); i++) {
            y= n[i];
            n[i]= n[n.length - 1 - i];
            n[n.length - 1 - i]= y;
        }
        for(int i= 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }
        t.close();
    }
 
}
