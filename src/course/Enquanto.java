package course;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double number = 0;
		
		while (number >= 0) {
			System.out.println("Digite um n�mero: ");
			number = sc.nextDouble();
			System.out.println("continua no loop...");
		}
		
		
		System.out.println("sa�da do loop...");
		sc.close();

	}

}
