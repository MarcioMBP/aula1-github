package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double areaCirculo = pi * raio * raio;
		
		System.out.printf("A = %.4f", areaCirculo);
		
		sc.close();
		
	}

}
