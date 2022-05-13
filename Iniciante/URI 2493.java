import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			String ln = leitor.nextLine();
			while (ln.equals("")) {
				ln = leitor.nextLine();
			}
			int T = Integer.valueOf(ln.trim());
			String[] jogadas = new String[T];
			String[] respostas = new String[T];
			SortedSet<String> players = new TreeSet<>();
			
			for (int i = 0; i < T; i++) {
				String line = leitor.nextLine();
				while (line.equals("")) {
					line = leitor.nextLine();
				}
				jogadas[i] = line.replace(' ', '=');
			}
			
			for (int i = 0; i < T; i++) {
				String line = leitor.nextLine();
				while (line.equals("")) {
					line = leitor.nextLine();
				}
				respostas[i] = line;
			}
			
			for (int i = 0; i < T; i++) {
				String[] resposta = respostas[i].split(" ");
				String player = resposta[0];
				int index = Integer.valueOf(resposta[1].trim()) - 1;
				char operacao = resposta[2].charAt(0);
				String[] jogada = jogadas[index].split("=");
				int n0 = Integer.valueOf(jogada[0].trim());
				int n1 = Integer.valueOf(jogada[1].trim());
				int n2 = Integer.valueOf(jogada[2].trim());
				if (!respostaValida(n0, n1, n2, operacao)) {
					players.add(player);
				}
			}
			
			if (players.size() == T) {
				System.out.println("None Shall Pass!");
			} else if (players.size() == 0) {
				System.out.println("You Shall All Pass!");
			} else {
				System.out.println(String.join(" ", players));
			}
			players.clear();
		}
		leitor.close();
	}
	
	private static boolean respostaValida(int n0, int n1, int n2, char operacao) {
		switch (operacao) {
			case '*': return n0 * n1 == n2;
			case '+': return n0 + n1 == n2;
			case '-': return n0 - n1 == n2;
			case 'I': return (n0 * n1 != n2) && (n0 + n1 != n2) && (n0 - n1 != n2); 
			default: return true;
		}
	}
	
}
