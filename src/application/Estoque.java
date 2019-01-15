package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Enter Product Data:");
		System.out.print("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity: ");
		produto.quantity = sc.nextInt();
		
		System.out.println(produto.toString());
		System.out.println();
		System.out.println("Quantas TVs novas entraram em estoque?");
		
		produto.addProducts(sc.nextInt());
		System.out.println(produto.toString());
		System.out.println();
		
		System.out.println("Quantas TVs foram vendidas?");
		produto.removeProducts(sc.nextInt());
		System.out.println(produto.toString());
		
		
		
		sc.close();

	}

}
