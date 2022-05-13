import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int horaInicial, horaFinal;
        horaInicial= t.nextInt();
        horaFinal= t.nextInt();
        if(horaFinal > horaInicial) {
            System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
        }else {
            if(horaInicial > horaFinal) {
                System.out.println("O JOGO DUROU " + ((horaFinal + 24) - horaInicial) + " HORA(S)");
            }else {
                if(horaInicial == horaFinal) {
                    System.out.println("O JOGO DUROU 24 HORA(S)");
                }
            }
        }
        t.close();
    }
 
}
