package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite matriz de ordem N: ");
		int num = sc.nextInt();
		int[][] matriz = new int[num][num];
		
		
		for (int i=0; i<num; i++) 
			for (int j=0; j<num; j++)	{
			System.out.print("Digite valor na posição ["+i+"]"+"["+j+"]");
			matriz[i][j] = sc.nextInt();
		}
		
		System.out.println("Diagonal Principal:");
		for (int i=0; i<num; i++) {
			System.out.print(matriz[i][i]+" ");
		}
		
		System.out.println();
		int cont = 0;
		System.out.println("Valores negativos da Matriz e quantidade de valores negativos:");
		for (int i=0; i<num; i++) 
		    for (int j=0; j<num; j++) {
		         if (matriz[i][j] < 0) {
		        	 System.out.print(matriz[i][j]+" ");
		        	 cont++;
		         }
		    }
		
		System.out.println();
		System.out.println("A quantidade de valores negativos é: "+cont);
		
		sc.close();

	}

}
