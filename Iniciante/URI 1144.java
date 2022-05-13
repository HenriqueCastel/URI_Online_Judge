import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n= t.nextInt();
        for(int i= 1; i <= n; i++) {
            System.out.println(i + " " + i * i + " " + i * i * i);
            System.out.println(i + " " + (i * i + 1) + " " + (i * i * i + 1));
        }
        t.close();
    }
 
}
