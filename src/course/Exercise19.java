package course;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float valorX = sc.nextFloat();
		float valorY = sc.nextFloat();
		
		if (valorX>0 && valorY>0)
			System.out.println("QUADRANTE 1");
		else if (valorX<0 && valorY>0)
			System.out.println("QUADRANTE 2");
		else if (valorX<0 && valorY<0)
			System.out.println("QUADRANTE 3");
		else if (valorX>0 && valorY<0)
			System.out.println("QUADRANTE 4");
		else
			System.out.println("ORIGEM");
		
		
		sc.close();

	}

}
