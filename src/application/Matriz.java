package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite matriz de ordem MxN. Digite M: \n");
		int m = sc.nextInt();
		System.out.print("Digite matriz de ordem MxN. Digite N: \n");
		int n = sc.nextInt();
		
		System.out.println();
				
		int[][] mat = new int[m][n];
		
		System.out.println("Agora preencha a matriz:");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println("Digite matriz na posi��o: ["+i+"]"+"["+j+"]");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Ler um n�mero de ocorr�ncia X: ");
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
				}
		}
		
		sc.close();

	}

}