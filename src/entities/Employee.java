package entities;

public class Employee implements Comparable<Employee> {
		
	private String name;
	private Integer hours;
	private Double valuePerHour;
	private Double salary;
	private String email;
	
	public Employee() {		
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}	

	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}	
	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double payment() {
		return hours * valuePerHour;
	}

	@Override
	public int compareTo(Employee other) {
		return -salary.compareTo(other.getSalary());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", email=" + email + "]";
	}
	
	
	
	
}
