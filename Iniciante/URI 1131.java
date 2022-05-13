import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        int gremio, inter, cont= 0, contInter= 0, contGremio= 0, contEmpate= 0, pesquisa;
        do {
            inter= t.nextInt();
            gremio= t.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            pesquisa= t.nextInt();
            cont++;
            if(inter > gremio) {
                contInter++;
            }
            if(gremio > inter) {
                contGremio++;
            }
            if(inter == gremio) {
                contEmpate++; 
            }
        }while(pesquisa != 2);
        System.out.println(cont + " grenais");
        System.out.println("Inter:" + contInter);
        System.out.println("Gremio:" + contGremio);
        System.out.println("Empates:" + contEmpate);
        if(contInter > contGremio) {
            System.out.println("Inter venceu mais");
        }
        if(contGremio > contInter) {
            System.out.println("Gremio venceu mais");
        }
        if(contInter == contGremio) {
            System.out.println("Nao houve vencedor");
        }    
        t.close();
    }
 
}
