package Vinetka;

import Vehicle.Vehicle;

public abstract class Vinetka {
	private int day, month, year;
	private String color;
	private VinetkaPeriod period;
	private ColorType vinetkaColor;

	public int getPrice() {
		return this.period.getPrice();
	}

	public VinetkaPeriod getPeriod() {
		return period;
	}

	public boolean isExpired(int day, int month, int year) {
		switch (this.period) {
		case DAY:
			if (day == 1) {
				return true;
			}
			return day > this.day;
		case MONTH:
			if (month == 1) {
				return true;
			}
			return month > this.month;
		case YEAR:
			return year > this.year;
		}
		return false;

	}

	public abstract void zalepi(Vehicle vehicle);

	public ColorType getVinetkaColor() {
		return vinetkaColor;
	}

	public void setVinetkaColor(ColorType vinetkaColor) {
		this.vinetkaColor = vinetkaColor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPeriod(VinetkaPeriod period) {
		this.period = period;
	}

}
