package course;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		
		if (codigo == 1)
			System.out.printf("C�digo: %d	Especifica��o: Cachorro-Quente	Total: $%.2f",codigo,(float)qtd*4);
		else if (codigo == 2)
			System.out.printf("C�digo: %d	Especifica��o: X-Salada 	Total: $%.2f",codigo,(float)qtd*4.50);
		else if (codigo == 3)
			System.out.printf("C�digo: %d	Especifica��o: X-Bacon		Total: $%.2f",codigo,(float)qtd*5);
		else if (codigo == 4)
			System.out.printf("C�digo: %d	Especifica��o: Torrada		Total: $%.2f",codigo,(float)qtd*2);
		else
			System.out.printf("C�digo: %d	Especifica��o: Refrigerante	Total: $%.2f",codigo,(float)qtd*1.50);
		
		sc.close();

	}

}
