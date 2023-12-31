package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		// DATA INPUT
		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}

		// READ THE EMPLOYEE ID
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		// LOOKING FOR THE POSITION EMPLOYEE ID
		Integer pos = position(list, idsalary); 
		
		if(pos == null) {
			// NULL ID = DOES NOT EXIST
			System.out.println("This id does not exist!");
		} else {
			// ID EXISTS = I ASK THE PERCENTAGE AND I INCREASE THE PERCENTAGE IN THE EMPLOYEE'S SALARY
			System.out.println("Enter the percentage: ");
			Double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);;
		}

		System.out.println();
		System.out.println("List of employees: ");
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {

		// FIND THE ID IN THE LIST
		for (int i = 0; i < list.size(); i++) {

			// IF I FIND THE ID...
			if(list.get(i).getId() == id) {
				// RETURN THE I VALUE
				return i;
			}
			 
			return null;
		}

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}