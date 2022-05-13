import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n= t.nextInt();
        for(int i= 0; i < n; i++) {
            int x= t.nextInt();
            if(x > 0 && x % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            }else {
                if(x > 0 && x % 2 != 0) {
                    System.out.println("ODD POSITIVE");
                }else {
                    if(x < 0 && x % 2 == 0) {
                        System.out.println("EVEN NEGATIVE");
                    }else {
                        if(x < 0 && x % 2 != 0) {
                            System.out.println("ODD NEGATIVE");
                        }else {
                            if(x == 0){
                                System.out.println("NULL");
                            }
                        }
                    }
                }
            }
        }
        t.close();
    }
 
}
