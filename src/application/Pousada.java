package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.RegistroAluguel;

public class Pousada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		RegistroAluguel[] vetor = new RegistroAluguel[10];
		RegistroAluguel ra = new RegistroAluguel();
		
		int numEstudantes;
		System.out.printf("Digite o número de estudantes que irão alugar os quartos:");
		numEstudantes = sc.nextInt();
				
		for (int i=1; i<=numEstudantes; i++) {
			sc.nextLine();
			System.out.println("Digite o nome, e-mail e quarto em que o estudante "+i+" ficará");
			String nome = sc.nextLine();
			ra.setNome(nome);
			String email = sc.nextLine();
			ra.setEmail(email);
			int quarto = sc.nextInt();
			ra.setQuarto(quarto);
			
			vetor[ra.getQuarto()-1] = new RegistroAluguel(nome, email, quarto);
		}
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] != null)
				System.out.println(vetor[i].toString());
		}
		
		
		sc.close();

	}

}
