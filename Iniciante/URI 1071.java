import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int x, y, soma= 0;
        x= t.nextInt();
        y= t.nextInt();
        if(x > y) {
            for(int i= y + 1; i < x; i++) {
                if(i % 2 != 0) {
                    soma += i;
                }
            }
        }else {
            if(y > x) {
                for(int i= x + 1; i < y; i++) {
                    if(i % 2 != 0) {
                        soma += i;
                    }
                }
            }else {
                if(x == y) {
                    soma= 0;
                }
            }
        }
        System.out.println(soma);
        t.close();
    }
 
}
