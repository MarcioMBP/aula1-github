package course;

import java.util.Scanner;

public class Postogasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("Pesquisa de Satisfação");
		System.out.println("Digite 1 - Álcool; 2 - Gasolina; 3 - Diesel; 4 - Fim ");
		int opcao = sc.nextInt();
		
		while (opcao != 4) {
			if (opcao == 1)
				alcool = alcool+1;
			else if (opcao == 2)
				gasolina = gasolina+1;
			else if (opcao == 3)
				diesel = diesel+1;
			else
				System.out.println("Digite novamente opção inválida");
			
			opcao = sc.nextInt();
		}
		
		System.out.println("Resultado final da pesquisa");
		System.out.println("Álcool = "+alcool);
		System.out.println("Gasolina = "+gasolina);
		System.out.println("Diesel = "+diesel);
		sc.close();

	}

}
