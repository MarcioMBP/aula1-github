package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;

public class SalarioFunc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("ENTER EMPLOYEE DATA:");
		System.out.print("NAME: ");
		employee.name = sc.nextLine();
		System.out.print("GROSS SALARY: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("TAX: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee.toString());
		System.out.println();
		
		System.out.println("WHICH PERCENTAGE TO INCREASE SALARY");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println(employee.toString());
		System.out.println();
		
		
		
		
		sc.close();

	}

}
