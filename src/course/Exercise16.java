package course;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour_stard = sc.nextInt();
		int hour_finish = sc.nextInt();
		
		if (hour_stard < hour_finish)
			System.out.printf("A duração da partida foi de %d horas",hour_finish-hour_stard);
		else
			System.out.printf("A duração da partida foi de %d horas", 24-hour_stard+hour_finish);
		
				
		sc.close();
		

	}

}
