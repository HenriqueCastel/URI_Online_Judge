import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        while(entrada.hasNext()){
            int n = entrada.nextInt();
            System.out.println(n-1);
        }
    }
}
