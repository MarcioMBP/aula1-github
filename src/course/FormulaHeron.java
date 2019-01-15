package course;

import java.util.Locale;
import java.util.Scanner;

public class FormulaHeron {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double area1 = 0, area2 = 0;
		
		for (int cont=1; cont<=2; cont++) {
			System.out.println("Digite os lados do tri�ngulo");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double p = (a+b+c)/2;
			
			double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			
			if (cont == 1)
				area1 = area;
			else
				area2 = area;
			
		}
		
		System.out.printf("Tri�ngulo X area: %.4f%n",area1);
		System.out.printf("Tri�ngulo Y area: %.4f%n",area2);
		
		if (area1>area2)
			System.out.println("�rea do Tri�ngulo X � maior do que a �rea do tri�ngulo Y");
		else
			System.out.println("�rea do Tri�ngulo Y � maior do que a �rea do tri�ngulo X");
		sc.close();

	}

}
