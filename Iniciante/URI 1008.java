import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner t =new Scanner(System.in);
    	int a, b;
        float c;
        a= t.nextInt();
        b= t.nextInt();
        c= t.nextFloat();
        System.out.printf("NUMBER = %d\n", a);
        System.out.printf("SALARY = U$ %.2f\n", b * c);
        t.close();
    }

}
