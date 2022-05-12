import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t = new Scanner(System.in);
        String pergunta;
        int n = t.nextInt();
        for(int i = 0; i < n; i++) {
            pergunta = t.next();
            System.out.println("I am Toorg!");
        }
        t.close();
 
    }
 
}
