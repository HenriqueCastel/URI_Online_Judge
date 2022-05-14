import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Locale.setDefault(new Locale("en", "US"));
		Scanner t= new Scanner(System.in);
		while(t.hasNext()){
			int l = Integer.parseInt(t.nextLine());
			List<Integer>lesma = new ArrayList<>();
			String[] ll= new String[l];
			String aux= t.nextLine();
			ll= aux.split(" ");
			for(int i= 0; i < l; i++) {
				lesma.add(Integer.parseInt(ll[i]));
			}
			Collections.sort(lesma);
			Collections.reverse(lesma);
			if(lesma.get(0)>=20) {
				System.out.println("3");
			}else {
				if(lesma.get(0) < 20 && lesma.get(0) >= 10) {
					System.out.println("2");
				}else {
				System.out.println("1");
				}
			}
		}
		t.close();
	}
}
