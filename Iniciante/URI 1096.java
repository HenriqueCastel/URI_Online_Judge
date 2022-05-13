import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		int i= 1;
		while(i <= 9) {
			for(int j= 7; j > 4; j--) {
				System.out.println("I=" + i + " J=" + j);
			}
			i+= 2;
		}
	}
	
}
