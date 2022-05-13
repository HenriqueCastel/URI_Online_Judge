import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner t= new Scanner(System.in);
        float n1, n2, n3, n4, exame, media, mediaFinal;
        n1= t.nextFloat();
        n2= t.nextFloat();
        n3= t.nextFloat();
        n4= t.nextFloat();
        media= ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media: %.1f\n", media);
        if(media >= 7) {
            System.out.println("Aluno aprovado.");
        }else {
            if(media < 5) {
                System.out.println("Aluno reprovado.");
            }else {
                if(media >= 5 && media < 7) {
                    System.out.println("Aluno em exame.");
                    exame= t.nextFloat();
                    System.out.printf("Nota do exame: %.1f\n", exame);
                    mediaFinal= (media + exame) / 2;
                    if(mediaFinal >= 5) {
                        System.out.println("Aluno aprovado.");
                    }else {
                        System.out.println("Aluno reprovado.");
                    }
                    System.out.printf("Media final: %.1f\n", mediaFinal);
                }
            }
        }
        t.close();
    }
 
}
