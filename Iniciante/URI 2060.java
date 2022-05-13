import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t = new Scanner(System.in);
        int l, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        int n = t.nextInt();
        for(int i = 0; i < n; i++) {
            l = t.nextInt();
            if(l % 2 == 0) {
                cont2++;
            }
            if(l % 3 == 0) {
                cont3++;
            }
            if(l % 4 == 0) {
                cont4++;
            }
            if(l % 5 == 0) {
                cont5++;
            }
        }
        System.out.println(cont2 + " Multiplo(s) de 2");
        System.out.println(cont3 + " Multiplo(s) de 3");
        System.out.println(cont4 + " Multiplo(s) de 4");
        System.out.println(cont5 + " Multiplo(s) de 5");
        t.close();
    }
 
}
