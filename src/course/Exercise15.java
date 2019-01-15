package course;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		
		if (n1>n2) {
			if (n1%n2 == 0)
		       System.out.printf("O número %d é múltiplo de %d",n1, n2);
			else
				System.out.printf("O número %d não é múltiplo de %d",n1, n2);
		}
		else
		{
			if (n2%n1 == 0)
				System.out.printf("O número %d é múltiplo de %d",n2, n1);
			else
				System.out.printf("O número %d não é múltiplo de %d",n2, n1);
		}
		
		
		sc.close();	
		

	}

}
