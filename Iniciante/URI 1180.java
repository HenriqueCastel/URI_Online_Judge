import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t = new Scanner(System.in);
        int n, menor = 99999, posicao = 0; 
        n = t.nextInt();
        int x[] = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = t.nextInt();
            if(x[i] < menor) {
                menor = x[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
        t.close();
    }
 
}
