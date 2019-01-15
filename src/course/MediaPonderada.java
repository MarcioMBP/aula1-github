package course;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int cont=1; cont<=n; cont++) {
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			
			double mediaPonderada = (nota1*2+nota2*3+nota3*5)/10;
			System.out.printf("A média ponderada é: %.1f%n",mediaPonderada);
			
		}
		
		System.out.println("Acabou o programa!");
		sc.close();

	}

}
