package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("outSorced?(y/n) ");
			char outSorced = sc.next().charAt(0);

			System.out.println("name: ");
			String name = sc.next();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Valuer per hour: ");
			double valuePerHour = sc.nextDouble();
			if (outSorced == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		for(Employee emp : list) {
			System.out.println("Name: " + emp.getName() + ", Payment: " + emp.payment());
		}
		sc.close();
	}
}
