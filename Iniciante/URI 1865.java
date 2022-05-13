import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int c= t.nextInt();
        for(int i= 0; i < c; i++) {
            String nome= t.next();
            int n= t.nextInt();
            if(nome.equalsIgnoreCase("thor")) {
                System.out.println("Y");
            }else {
                System.out.println("N");
            }
        }
        t.close();
    }
 
}
