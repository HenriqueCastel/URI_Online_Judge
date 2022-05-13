import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[]args) throws IOException {
      
        Scanner t= new Scanner(System.in);
        int row[]= new int[100];
        int x;
        int y;
        int n;
        while(true){
            n= t.nextInt();
            if(n==0)break;
            x= 1;
            y= 0;
            for(int i= 1; i <= n; i++)row[++y]= i;
            System.out.print("Discarded cards: ");
            while(y!=x){
                if(x>1)System.out.print(", ");
                System.out.print(row[x++]);
                row[++y]= row[x++];
            }
            System.out.println("\nRemaining card: " + row[x]);
        }
        t.close();
    }
}
