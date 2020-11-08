package com.employedb;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeManagent {
	private static Scanner sc;

	public static void main(String args[]) {
		Set<Employee> set = new TreeSet<Employee>();
		sc = new Scanner(System.in);
		String id;
		String name;
		String designation;
		double salary;

		while (true)

		{
			System.out.print("\nThe Choices:\n1>Add\n2>Update\n3>Remove\n4>Display\n5>Sort\n6>Search\n");
			System.out.println("Enter the choice: ");
			System.out.println("To quit type -1");
			int choice = sc.nextInt();
			if (choice == -1) {
				break;
			}
			switch (choice) {
			case 1: {
				System.out.print("\nId: ");
				id = sc.next();
				System.out.print("\nName: ");
				name = sc.next();
				System.out.print("\nDesignation: ");
				designation = sc.next();
				System.out.print("\nSalary: ");
				salary = sc.nextDouble();

				Employee db = new Employee(id, name, designation, salary);
				set.add(db);
			}
				break;
			case 2: {
				System.out.println("\nEnter the Employee ID to EDIT the details");
				id = sc.next();
				for (Employee s : set) {
					if (s.getId().equals(id)) {
						System.out.print("\nName: ");
						name = sc.next();
						System.out.print("\nDesignation: ");
						designation = sc.next();
						System.out.print("\nSalary: ");
						salary = sc.nextDouble();

						s.setName(name);
						s.setDesignation(designation);
						s.setSalary(salary);
					}
				}
			}
			break;
			case 3: {
				System.out.print("\nEnter EmployeeId to delete: ");
				id = sc.next();
				Employee existing = null;
				for (Employee s : set) {
					if (s.getId().equals(id)) {
						existing = s;
					}
				}
				set.remove(existing);
				break;
			}

			case 4: {

				System.out.println("ID" + "\t" + "NAME" + "\t" + "DESIGNATION" + "\t" + "SALARY");
				for (Employee s : set) {
					System.out.println(
							"\n" + s.getId() + "\t " + s.getName() + "\t" + s.getDesignation() + "\t" + s.getSalary());
				}
				break;
			}
			case 5: {
				// Sort employee details(based on employee id) using comparable and display
//				Collections.sort(employess);
//				for (Employee s : employess) {
//					System.out.println(
//							"\n" + s.getId() + "\t " + s.getName() + "\t" + s.getDesignation() + "\t" + s.getSalary());
//				}
//				break;
			}

			case 6: { // Add get single employee details
				System.out.println("\nEnter the Employee ID ");
				id = sc.next();
				for (Employee s : set) {
					if (s.getId().equals(id)) {
						System.out.println("ID" + "\t" + "NAME" + "\t" + "DESIGNATION" + "\t" + "SALARY");
						System.out.println("\n" + s.getId() + "\t " + s.getName() + "\t" + s.getDesignation() + "\t"
								+ s.getSalary());
					}
				}
			}
			}

		}
	}
}
