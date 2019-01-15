package course;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		System.out.println("Digit the first number:");
		a = sc.nextInt();
		System.out.println("Digit the second number:");
		b = sc.nextInt();
		System.out.println("Digit the third number:");
		c = sc.nextInt();
		System.out.println("Digit the fourth number:");
		d = sc.nextInt();
		
		diferenca = (a*b - c*d);
		
		System.out.println("DIFERENÇA: "+diferenca);
		
		sc.close();

	}

}
