import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int a, b, c, d;
        a= t.nextInt();
        b= t.nextInt();
        c= t.nextInt();
        d= t.nextInt();
        if(b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }
        t.close();   
    }
 
}
