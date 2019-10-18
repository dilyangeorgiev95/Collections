package Vinetka;

public enum ColorType {
	BUSCOLOR("red"), CARCOLOR("green"), TRUCKCOLOR("black");
	
	private String color;
	
	private ColorType(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
