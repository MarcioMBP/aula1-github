package course;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		if (n1 % 2 == 0)
			System.out.println("Número par!");
		else
			System.out.println("Número ímpar!");
		
		sc.close();
		
		

	}

}
