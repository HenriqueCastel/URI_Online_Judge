import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n= t.nextInt();
        if(n >= 0 && n <= 1000000) {
            for(int i= 1; i < n; i++) {
                System.out.print("Ho ");
            }
            System.out.println("Ho!");
        }
        t.close();
    }
 
}
