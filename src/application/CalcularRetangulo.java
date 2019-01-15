package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class CalcularRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		System.out.print("WIDTH: ");
		retangulo.width = sc.nextDouble();
		System.out.print("HEIGHT: ");
		retangulo.height = sc.nextDouble();
		System.out.println();
		
		System.out.printf("AREA: %.2f%n", retangulo.area());
		System.out.printf("PERIMETER: %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL: %.2f", retangulo.diagonal());
		
		sc.close();

	}

}
