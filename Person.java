package Ex1;

public class Person {
	private String name;
	private String adress;
	private int age;
	
	Person(String name, int age, String adress){
		this.name = name;
		this.age = age;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAdress() {
		return adress;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Adress : " + adress);
	}
}
