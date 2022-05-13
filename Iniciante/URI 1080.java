import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int x, maior= -9999, posicao= 1;
        for(int i= 0; i < 100; i++) {
            x= t.nextInt();
            if(x > maior) {
                maior= x;
                posicao= i + 1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        t.close();
    }
 
}
