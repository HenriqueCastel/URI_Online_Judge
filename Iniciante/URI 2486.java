import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner leitor = new Scanner(System.in);
		int T = leitor.nextInt();
		while (T != 0) {
			int totalVitaminaC = 0;
			for (int i = 0; i < T; i++) {
				int quantia = leitor.nextInt();
				String nomeAlimento = leitor.nextLine().replace(" ", "");
				Alimento alimento = Alimento.valueOf(nomeAlimento);
				totalVitaminaC += alimento.vitaminaC * quantia;
			}

			if (totalVitaminaC < 110) {
				System.out.println("Mais " + (110 - totalVitaminaC) + " mg");
			} else if (totalVitaminaC > 130) {
				System.out.println("Menos " + (totalVitaminaC - 130) + " mg");
			} else {
				System.out.println(totalVitaminaC + " mg");
			}

			T = leitor.nextInt();
		}
	}

	enum Alimento {

		sucodelaranja(120),
		morangofresco(85),
		mamao(85),
		goiabavermelha(70),
		manga(56),
		laranja(50),
		brocolis(34);

		private int vitaminaC;

		Alimento(int vitaminaC) {
			this.vitaminaC = vitaminaC;
		}
	}
	
}
