package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.printf("A �rea do tri�ngulo-ret�ngulo �: %.3f%n",(a*c)/2);
		System.out.printf("A �rea do c�rculo �: %.3f%n", pi*(c*c));
		System.out.printf("A �rea do trap�zio �: %.3f%n", ((a+b)*c)/2);
		System.out.printf("A �rea do quadrado �: %.3f%n",b*b);
		System.out.printf("A �rea do ret�ngulo �: %.3f",a*b);
		
		sc.close();	
		
				

	}

}
