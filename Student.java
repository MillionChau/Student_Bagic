package Ex1;

public class Student extends Person {
	private double gpa;
	
	Student(String name, int age, String adress, double gpa){
		super(name,age,adress);
		this.gpa = gpa;
	}
	public void display() {
		super.display();
		System.out.println("GPA : " + gpa);
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
