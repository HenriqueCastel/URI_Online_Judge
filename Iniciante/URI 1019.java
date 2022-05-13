import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n, hora, minuto, segundo;
        n= t.nextInt();
        hora= n / 3600;
        n -= hora * 3600;
        minuto= n / 60;
        n -= minuto * 60;
        segundo= n;
        System.out.println(hora + ":" + minuto + ":" + segundo);
        t.close();
    }
 
}
