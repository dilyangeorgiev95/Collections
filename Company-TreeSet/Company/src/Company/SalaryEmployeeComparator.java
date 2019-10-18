package Company;

import java.util.Comparator;

public class SalaryEmployeeComparator implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() == o2.getSalary()) {
			return o1.getName().compareTo(o2.getName());
		}
		return o1.getSalary()-o2.getSalary();
}
}