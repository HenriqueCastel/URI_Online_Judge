import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t = new Scanner(System.in);
        int x, contIn = 0, contOut = 0;
        int n = t.nextInt();
        for(int i = 0; i < n; i++) {
            x = t.nextInt();
            if(x >= 10 & x <= 20) {
                contIn++;
            }else {
                contOut++;
            }
        }    
        System.out.println(contIn + " in");
        System.out.println(contOut + " out");
        t.close();
    }
 
}
