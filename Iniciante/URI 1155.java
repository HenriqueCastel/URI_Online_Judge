import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		float s= 0, i;
		for (i = 1; i <= 100; i++) {
			s += (1 / i);
		}
		System.out.printf("%.2f\n", s);
	}
}
