package course;

import java.util.Scanner;

public class Sistemacartesiano {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a coordenada X: ");
		int x = sc.nextInt();
		System.out.print("Digite a coordenada Y: ");
		int y = sc.nextInt();
				
		while (x != 0 && y != 0) {
			if (x>0 && y>0)
				System.out.println("Quadrante 1");
			else if (x>0 && y<0)
				System.out.println("Quadrante 4");
			else if (x<0 && y>0)
				System.out.println("Quadrante 2");
			else
				System.out.println("Quadrante 3");
			
			System.out.println("Digite as coordenadas X e Y");
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		System.out.println("Programa Finalizado!");
		sc.close();

	}

}
