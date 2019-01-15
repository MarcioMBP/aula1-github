package course;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cod1 = sc.nextLine();
		String cod2 = sc.nextLine();
		String cod3 = sc.nextLine();
		
		String nom1 = sc.nextLine();
		String nom2 = sc.nextLine();
		String nom3 = sc.nextLine();
		
		double preco1 = sc.nextDouble();
		double preco2 = sc.nextDouble();
		double preco3 = sc.nextDouble();
		
		int qtd1 = sc.nextInt();
		int qtd2 = sc.nextInt();
		int qtd3 = sc.nextInt();
		
		double valorTotal1 = preco1 * qtd1;
		double valorTotal2 = preco2 * qtd2;
		double valorTotal3 = preco3 * qtd3;
		
		System.out.println("REGISTRO DE COMPRAS:");
		System.out.print("CÓDIGO	NOME		PREÇO UNITÁRIO	QTD	VALOR TOTAL\n");
		System.out.printf("%s	%s  	%.2f		%d     	%.2f%n",cod1, nom1, preco1, qtd1, valorTotal1);
		System.out.printf("%s	%s  	%.2f		%d     	%.2f%n",cod2, nom2, preco2, qtd2, valorTotal2);
		System.out.printf("%s	%s		%.2f	%d     	%.2f"  ,cod3, nom3, preco3, qtd3, valorTotal3);
		
		sc.close(); 
		
		

	}

}

