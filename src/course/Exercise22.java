package course;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma opção: 1 - Adicionar; 2 - Excluir; 3 - Alterar; outros - Sair");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Adicionar");
			break;
		
		case 2:
			System.out.println("Excluir");
			break;
			
		case 3:
			System.out.println("Alterar");
			break;
			
		default:
			System.out.println("Saída");
			
		
		}
		
		sc.close();

	}

}
