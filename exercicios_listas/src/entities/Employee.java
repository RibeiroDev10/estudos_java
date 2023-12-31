package entities;

public class Employee {

	// ATTRIBUTES
	private int id;
	private String name;
	private Double salary;

	// CONSTRUCTORS
	public Employee() {

	}

	public Employee(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	// METHODS
	public void increaseSalary(double percentage) {

		salary += salary * percentage / 100;
		
	}
	
	public String toString() {
		return id 
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f", salary);
	}
}