package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Student;

public class Escola {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Digite o nome do Aluno: ");
		student.nome = sc.nextLine();
		
		System.out.print("Digite a nota do primeiro trimestre: ");
		student.nota1 = sc.nextDouble();
		while (student.nota1 > 30) {
			  System.out.print("Digite a nota do primeiro trimestre: ");
			  student.nota1 = sc.nextDouble();
		}
		
		System.out.print("Digite a nota do segundo trimestre: ");
		student.nota2 = sc.nextDouble();
		while (student.nota2 > 35) {
			  System.out.print("Digite a nota do segundo trimestre: ");
			  student.nota2 = sc.nextDouble();
		}
		
		System.out.print("Digite a nota do terceiro trimestre: ");
		student.nota3 = sc.nextDouble();
		while (student.nota3 > 35) {
			  System.out.print("Digite a nota do terceiro trimestre: ");
			  student.nota3 = sc.nextDouble();
		}
		
		System.out.printf("Nota Final: %.2f%n",student.notaFinal());
		
		if (student.notaFinal() < 60.00) {
			System.out.println(student.nome + " FAILED");
			System.out.printf("MISSING %.2f POINTS", 60.00 - student.notaFinal());
		}
		else {
			System.out.println(student.nome + " PASS");
		}
			
		
		sc.close();

	}

}
