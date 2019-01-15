package course;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int maior = max (x, y, z);
		
		mostra(maior);
		
		sc.close();

	}
	
	public static int max (int a, int b, int c) {
		int auxiliar;
		
		if (a>b && a>c)
			auxiliar = a;
		else if (b>c)
			auxiliar = b;
		else
			auxiliar = c;
		
		return auxiliar;
	}
	
	public static void mostra(int a) {
		System.out.println(a+" é o maior número dentre os 3 digitados");
	}

}
