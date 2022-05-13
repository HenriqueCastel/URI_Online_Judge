import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner t= new Scanner(System.in);
        double a[]= new double[100];
        for(int i= 0; i < 100; i++) {
            a[i]= t.nextDouble();
            if(a[i] <= 10) {
                System.out.println("A[" + i + "] = " + a[i]);
            }
        }
        t.close();
    }
 
}
