package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.CurrencyConverter;

public class ConverterDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println("What is the dollar price today?");
		cc.valorDollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		cc.qtdDollar = sc.nextInt();
		
		double valorConvertido = cc.converterDollarForReal();
		
		System.out.printf("Amount to be paid in reais: %.2f", 
				cc.valorComImposto(valorConvertido));
		
		
		
		
		
		sc.close();

	}

}
