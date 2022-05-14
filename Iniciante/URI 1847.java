import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner t = new Scanner(System.in);
        int A= t.nextInt();
        int B= t.nextInt();
        int C= t.nextInt();
        if(B < A && C >= B) {
        	System.out.println(":)");
        }else {
        	if (B > A && C <= B) {
        		System.out.println(":(");
        	}else {
        		if (B > A && C > B && (C - B) < (B - A)) {
        			System.out.println(":(");
        		}else {
        			if (B > A && C > B && (C - B) >= (B - A)) {
        				System.out.println(":)");
        			}else {
        				if (B < A && C < B && (B - C) < (A - B)) {
        					System.out.println(":)");
        				}else {
        					if (B < A && C < B && (B - C) >= (A - B)) {
        						System.out.println(":(");
        					}else {
        						if (B == A && C > B) {
        							System.out.println(":)");
        						}else {
        							if (B == A && C < B) {
        								System.out.println(":(");
        							}else {
        								System.out.println(":(");
        							}
        						}
        					}
        				}
        			}
        		}
        	}
        }
    }
	
}
