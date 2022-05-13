import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        float x, y;
        x= t.nextFloat();
        y= t.nextFloat();
        if(x > 0 && y > 0) {
            System.out.println("Q1");
        }else { 
            if(x < 0 && y > 0) {
                System.out.println("Q2");
            }else {
                if(x < 0 && y < 0) {
                    System.out.println("Q3");
                }else {
                    if(x > 0 && y < 0) {
                        System.out.println("Q4");
                    }else {
                        if(x != 0 && y == 0) {
                            System.out.println("Eixo X");
                        }else {
                            if(x == 0 && y != 0) {
                                System.out.println("Eixo Y");
                            }else {
                                if(x == 0 && y == 0) {
                                    System.out.println("Origem");
                                }
                            }
                        }
                    }
                }
            }
        }
        t.close();
    }
 
}
