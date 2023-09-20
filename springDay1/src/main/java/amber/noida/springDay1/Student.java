package amber.noida.springDay1;

public class Student {
	
	String name;
	
	Student(String name){
		this.name = name;
		System.out.println("Student name is: "+name);
	}

	void display() {
		System.out.println("This is Student class");
	}
	
}
