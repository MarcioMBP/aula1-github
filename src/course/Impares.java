package course;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		for (int cont=1; cont<=num; cont++) {
			if (cont%2!=0)
				System.out.println(cont);
				
		}
				
		
		sc.close();

	}

}
