package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import utilities.Employee;

public class IncreaseSalary {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		// Part 1 - Reading Data
		
		System.out.print("How many employees will be registered? ");
		int numEmployees = sc.nextInt();
		
		for (int i=0; i < numEmployees; i++) {
			System.out.print("Enter "+(i+1)+" employee id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter "+(i+1)+" employee name: ");
			String name = sc.nextLine();
			System.out.print("Enter "+(i+1)+" employee salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			list.add(new Employee(id, name, salary));
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.newSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		
		
		sc.close();

	}

}
