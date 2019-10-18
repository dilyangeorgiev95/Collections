package Company;

import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		Company lucky = new Company("Lucky");
		
		lucky.hire(21, "lido", 623, 0);
		lucky.hire(21, "lido", 823, 1);
		lucky.hire(41, "roni", 10223, 2);
		lucky.hire(19, "divancho", 45123, 3);
		lucky.hire(22, "ivan", 5123, 4);
		
		lucky.hire(23, "dragan", 1623, 0);
		lucky.hire(24, "petkan", 1223, 1);
		lucky.hire(25, "vavan", 12513, 2);
		lucky.hire(26, "vlado", 4123, 3);
		lucky.hire(27, "mlado", 6123, 4);
		
		lucky.hire(22, "mitko", 1123, 0);
		lucky.hire(33, "fitko", 6123, 1);
		lucky.hire(44, "miro", 2123, 2);
		lucky.hire(55, "spir", 2123, 3);
		lucky.hire(25, "gido", 2123, 4);
		
		lucky.SortedEmployees();
		System.out.println("/n");
		lucky.allEmployeesByName();
	}
}
