package Ex1;

public class Teacher extends Person {
	
	private int salary;
	
	Teacher(String name, int age, String adress, int salary){
		super(name,age,adress);
		this.salary = salary;
	}
	public void display() {
		super.display();
		System.out.println("Salry : "+ salary);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
