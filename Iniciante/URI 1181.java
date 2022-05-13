import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t = new Scanner(System.in);
        int L = t.nextInt();
        double soma = 0;
        char T = t.next().toUpperCase().charAt(0);
        double M[][] = new double[12][12];
        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {
                M[i][j] = t.nextDouble();
            }
        }
        for(int j = 0; j < M.length; j++) {
            soma += M[L][j];
        }
        if(T == 'M') {
            soma /= M.length;
        }
        System.out.printf("%.1f\n", soma);
        t.close();
    }
 
}
