import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int n, ano, mes, dia;
        n= t.nextInt();
        ano= n / 365;
        n -= ano * 365;
        mes= n / 30;
        n -= mes * 30;
        dia= n;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        t.close();
    }
 
}
