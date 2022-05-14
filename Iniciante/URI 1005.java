import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        float a, b, m;
        Scanner sc = new Scanner(System.in);
        a= sc.nextFloat();
        b= sc.nextFloat();
        m= (float) ((a/11 * 3.5) + (b/11 * 7.5));
        System.out.printf("MEDIA = %.5f\n", m);
  
  }
}
