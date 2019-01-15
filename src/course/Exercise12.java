package course;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if ((n1>=n2) && (n1>=n3))
			System.out.println("O maior número é: "+n1);
		else if(n2>=n3)
			System.out.println("O maior número é: "+n2);
		else
			System.out.println("O maior número é: "+n3);
			
			
		sc.close();
		
	}

}
