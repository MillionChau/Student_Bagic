package Ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number of student:");
		n = sc.nextInt();
		Student[] listStudent = new Student[n];
		for(int i = 0 ; i < n; i++ ) {
			String Name, Adress;
			int Age;
			double GPA;
			sc.nextLine();
			System.out.print("Enter name : ");
			Name = sc.nextLine();
			System.out.print("Enter age : ");
			Age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter adress : ");
			Adress = sc.nextLine();
			System.out.print("Enter GPA : ");
			GPA = sc.nextDouble();
			listStudent[i] = new Student(Name,Age,Adress,GPA);
		}
		Student top1 =  listStudent[0];
		for(int i = 1; i < n; i++) {
			if(listStudent[i].getGpa() > top1.getGpa())
				top1 = listStudent[i];
		}
		top1.display();
		
		Teacher[] listT = new Teacher[n];
		for(int i = 0 ; i < n; i++ ) {
			String Name, Adress;
			int Age,Salary;
			sc.nextLine();
			System.out.print("Enter name : ");
			Name = sc.nextLine();
			System.out.print("Enter age : ");
			Age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter adress : ");
			Adress = sc.nextLine();
			System.out.print("Enter Salary : ");
			Salary = sc.nextInt();
			listT[i] =(Teacher) new Teacher(Name,Age,Adress,Salary);
		}
		Teacher Top1 =  listT[0];
		for(int i = 1; i < n; i++) {
			if(listT[i].getSalary() > Top1.getSalary())
				Top1 = listT[i];
		}
		Top1.display();
	}
}
