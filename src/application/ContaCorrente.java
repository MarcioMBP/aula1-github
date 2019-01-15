package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Bank;

public class ContaCorrente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank banco;
		
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Is There initial deposit (y/n)?");
		char opcao = sc.next().charAt(0);
		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depInicial = sc.nextDouble();
			banco = new Bank(numConta, titular, depInicial);
		}
		else {
			banco = new Bank(numConta, titular);
		}
		
		System.out.println("Account Data:");
		System.out.println(banco.toString());
		System.out.println();
		
		System.out.print("Enter initial deposit: ");
		banco.depositar(sc.nextDouble());
		
		System.out.println("Updated Account Data:");
		System.out.println(banco.toString());
		System.out.println();
		
		System.out.print("Enter Withdraw Data: ");
		banco.saque(sc.nextDouble());
		System.out.println("Updated Account Data:");
		System.out.println(banco.toString());
			
		
		
		
		sc.close();

	}

}
