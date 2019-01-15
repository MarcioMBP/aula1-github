package course;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int cod2 = sc.nextInt();
		int qtd_peca1 = sc.nextInt();
		int qtd_peca2 = sc.nextInt();
		double val_unit_peca1 = sc.nextDouble();
		double val_unit_peca2 = sc.nextDouble();
		double valor_total = (val_unit_peca1 * qtd_peca1 + val_unit_peca2 * qtd_peca2);
		
		System.out.println("ITENS DA COMPRA");
		System.out.printf("%d	%d		%.2f%n",cod1, qtd_peca1,val_unit_peca1);
		System.out.printf("%d	%d		%.2f%n",cod2, qtd_peca2,val_unit_peca2);
		System.out.printf("VALOR TOTAL: %.2f",valor_total);
		
		
		sc.close();
		
		

	}

}
