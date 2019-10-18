package staff;

public abstract class Staff {
	
	private String name;
	private String phoneNumber;
	
	public Staff(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;

	}

	public String getName() {
		return name;
	}
	
	
}
