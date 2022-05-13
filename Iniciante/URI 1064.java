import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int cont= 0;
        double n, soma= 0, media;
        for(int i= 0; i < 6; i++) {
            n= t.nextDouble();
            if(n > 0) {
                soma += n;
                cont++;
            }
        }
        media= soma / cont;
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n", media);
        t.close();
    }
 
}
