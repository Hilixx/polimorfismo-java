package entities;

public class Employee {
	public String name;
	protected int hours;
	protected double valuePerHour;
	
	
	public Employee() {
		
	}
	public Employee(String name, int hours, double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double payment() {
		
		return valuePerHour * hours;
	}
	
}
