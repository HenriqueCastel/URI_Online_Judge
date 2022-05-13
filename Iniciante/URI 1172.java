import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int x[]= new int[10];
        for(int i= 0; i < 10; i++) {
            x[i]= t.nextInt();
            if(x[i] <= 0) {
                x[i]= 1;
            }
            System.out.println("X[" + i + "] = " + x[i]);
        }
        t.close();
    }
 
}
