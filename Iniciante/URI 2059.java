import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner t = new Scanner(System.in);
		int p = t.nextInt(); 
		int j1 = t.nextInt();
		int j2 = t.nextInt(); 
		int r = t.nextInt(); 
		int a = t.nextInt();
		int soma = j1 + j2;
		if(soma % 2 == 0 && p == 1) {
			if(r == 0) {
				if(a == 0) {
					System.out.println("Jogador 1 ganha!");
				}else {
					if(a == 1) {
						System.out.println("Jogador 1 ganha!");
					}
				}
			}else {
				if(r == 1) {
					if(a == 0) {
						System.out.println("Jogador 1 ganha!");
					}else {
						if(a == 1) {
							System.out.println("Jogador 2 ganha!");
						}
					}
				}
			}
		}else {
			if(soma % 2 == 0 & p == 0) {
				if(r == 0) {
					if(a == 0) {
						System.out.println("Jogador 2 ganha!");
					}else {
						if(a == 1) {
							System.out.println("Jogador 1 ganha!");
						}
					}
				}else {
					if(r == 1) {
						if(a == 0) {
							System.out.println("Jogador 1 ganha!");
						}else {
							if(a == 1) {
								System.out.println("Jogador 2 ganha!");
							}
						}
					}
				}
			}else {
				if(soma % 2 != 0 & p == 1) {
					if(r == 0) {
						if(a == 0) {
							System.out.println("Jogador 2 ganha!");
						}else {
							if(a == 1) {
								System.out.println("Jogador 1 ganha!");
							}
						}
					}else {
						if(r == 1) {
							if(a == 0) {
								System.out.println("Jogador 1 ganha!");
							}else {
								if(a == 1) {
									System.out.println("Jogador 2 ganha!");
								}
							}
						}
					}
				}else {
					if(soma % 2 != 0 & p == 0) {
						if(r == 0) {
							if(a == 0) {
								System.out.println("Jogador 1 ganha!");
							}else {
								if(a == 1) {
									System.out.println("Jogador 1 ganha!");
								}
							}
						}else {
							if(r == 1) {
								if(a == 0) {
									System.out.println("Jogador 1 ganha!");
								}else {
									if(a == 1) {
										System.out.println("Jogador 2 ganha!");
									}
								}
							}
						}
					}
				}
			}
		}
		t.close();
	}

}
