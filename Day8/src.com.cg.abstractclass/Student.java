package src.com.cg.abstractclass;

public abstract class Student {

	int id;//variable
	
	//constructor
	public Student() {
		System.out.println("Student Constructor");
	}
	
	//methods - non abstract
	public void display() {
		
	}
	
	//methods - abstract - hide the contents
	public abstract void show();
	
}
