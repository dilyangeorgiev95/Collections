package Company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Company {
	Scanner sc = new Scanner(System.in);

	private static final int NUM_OF_DEPARTMENTS = 5;
	private String name;
	private List<Set<Employee>> departments = new ArrayList<Set<Employee>>();
	
	public Company(String name) {
		this.name = name;
		System.out.println("Enter Comparator");
		String comparator = sc.next();
		while (true) {
			if (comparator.toLowerCase().equals("age") || comparator.toLowerCase().equals("name")
					|| comparator.toLowerCase().equals("salary")) {
				break;
			} else {
				System.out.println("Not valid value, choose from AGE NAME SALARY");
				System.out.println("Enter Comparator");
				comparator = sc.next();
			}
		}
		for (int i = 0; i < NUM_OF_DEPARTMENTS; i++) {
			if (comparator.toLowerCase().equals("age")) {
				this.departments.add(new TreeSet<Employee>(new AgeEmployeeComparator()));
			}
			if (comparator.toLowerCase().equals("name")) {
				this.departments.add(new TreeSet<Employee>(new NameEmployeeComparator()));
			}
			if (comparator.toLowerCase().equals("salary")) {
				this.departments.add(new TreeSet<Employee>(new SalaryEmployeeComparator()));
			}
		}
	}

	public void hire(int age, String name, int salary, int department) {
		if (age >= 18 && age <= 65 && name != null && name != "" && salary > 400 && department >= 0
				&& department < NUM_OF_DEPARTMENTS) {
			Employee employee = new Employee(name, age, salary);
			this.departments.get(department).add(employee);
		} else {
			System.out.println("Not valid parameters for " + name);
		}
	}
	
	public void SortedEmployees() {
		for (int i = 0; i < NUM_OF_DEPARTMENTS; i++) {
			System.out.println();
			System.out.println("Department number" + i + "=====================");
			if (this.departments.get(i).size() == 0) {
				System.out.println("nqma nikoi");
			}
			for (Employee emp : departments.get(i)) {
				System.out.println(emp);
			}
		}
	}

	public void allEmployeesByName() {
		Set<Employee> newEmployees = new TreeSet<Employee>(new NameEmployeeComparator());
		for (int i = 0; i < NUM_OF_DEPARTMENTS; i++) {
			for (Employee emp : departments.get(i)) {
				newEmployees.add(emp);
			}
		}
		Set<Employee> newEmps = new TreeSet<Employee>(new NameEmployeeComparator());
		for (Employee ne : newEmployees) {
			if (newEmps.contains(ne)) {
				
			} else {
				newEmps.add(ne);
				System.out.println(ne);
			}
		}
	}
}
