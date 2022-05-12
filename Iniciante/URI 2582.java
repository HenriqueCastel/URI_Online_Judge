import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		for (int i = 0; i < C; i++) {
			int X = leitor.nextInt();
			int Y = leitor.nextInt();
			Musica music = Musica.valueOf("_"  + (X + Y));
			System.out.println(music.nome);
		}
	}

	enum Musica {
		_0("PROXYCITY"),
		_1("P.Y.N.G."),
		_2("DNSUEY!"),
		_3("SERVERS"),
		_4("HOST!"),
		_5("CRIPTONIZE"),
		_6("OFFLINE DAY"),
		_7("SALT"),
		_8("ANSWER!"),
		_9("RAR?"),
		_10("WIFI ANTENNAS");

		private String nome;
		
		Musica (String nome) {
			this.nome = nome;
		}
	}
	
}
