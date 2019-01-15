package course;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor >= 0 && valor <= 25)
			System.out.println("INTERVALO [0, 25]");
		else if (valor > 25 && valor <= 50)
			System.out.println("INTERVALO [25, 50]");
		else if (valor > 50 && valor <= 100)
			System.out.println("INTERVALO [50, 100]");
		else
			System.out.println("FORA DE INTERVALO");
		
		sc.close();
		
		

	}

}
