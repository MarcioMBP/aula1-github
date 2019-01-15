package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int op = 1;
		
		while (op != 0) {
			System.out.print("Digite a primeira nota: ");
			double nota1 = sc.nextDouble();
			System.out.print("Digite a segunda nota: ");
			double nota2 = sc.nextDouble();
			System.out.print("Digite a terceira nota: ");
			double nota3 = sc.nextDouble();
			
			double media = (nota1+nota2+nota3)/3;
			
			if (media < 6.0) { 
				System.out.printf("A média do aluno é %.2f%n", media);
				System.out.println("O aluno está reprovado!");
			}
			else {
				System.out.printf("A média do aluno é %.2f%n", media);
				System.out.println("O aluno está aprovado!");
			}
				
			System.out.println("Digite a opção: caso seja 0, o programa sai; do contrário, "
					+ "pede as notas de outro aluno");
			op = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.println("Saída do Programa!");
		sc.close();

	}

}
