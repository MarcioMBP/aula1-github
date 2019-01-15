package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num_func = sc.nextInt();
		int num_horas_trab = sc.nextInt();
		double valor_hora = sc.nextDouble();
		
		double calc = num_horas_trab * valor_hora;
		
		System.out.printf("NUMBER: %d%n",num_func);
		System.out.printf("SALARY: U$ %.2f",calc);
		
		
		sc.close();
		

	}

}
