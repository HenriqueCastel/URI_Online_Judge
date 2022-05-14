import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double a, b, c, med;
        Scanner t =new Scanner(System.in);
        a =t.nextDouble();
        b =t.nextDouble();
        c =t.nextDouble();
        med= (a/10 * 2) + (b/10 * 3) + (c/10 * 5);
        String media = String.format("MEDIA = %,.1f", med);
        System.out.print(media +"\n");
        t.close();
    }
}
