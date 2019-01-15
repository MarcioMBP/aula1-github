package course;

import java.util.Locale;
import java.util.Scanner;

public class FormulaHeron {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double area1 = 0, area2 = 0;
		
		for (int cont=1; cont<=2; cont++) {
			System.out.println("Digite os lados do triângulo");
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
		
		System.out.printf("Triângulo X area: %.4f%n",area1);
		System.out.printf("Triângulo Y area: %.4f%n",area2);
		
		if (area1>area2)
			System.out.println("Área do Triângulo X é maior do que a área do triângulo Y");
		else
			System.out.println("Área do Triângulo Y é maior do que a área do triângulo X");
		sc.close();

	}

}
