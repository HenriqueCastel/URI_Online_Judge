import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		int d;
		Scanner t = new Scanner(System.in);
		d= t.nextInt();
		int tempo= (int) (d / ((90 / 60.0) - (60 / 60.0)));
		System.out.printf("%d minutos\n", tempo);
		t.close();
	}

}
