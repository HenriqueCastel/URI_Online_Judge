import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int senha= t.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha= t.nextInt();
        }
        System.out.println("Acesso Permitido");
        t.close();
    }
 
}
