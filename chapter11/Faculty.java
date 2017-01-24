class Person{
	public Person(){
		System.out.println("(1) Performs Person's tasks");
	}
}

class Employee extends Person{
	public Employee(){
		this("(2) Invoke Empleyee's overloaded constructor");
		System.out.println("(3) Performs Empleyee's tasks");
	}
	public Employee(String s){
		System.out.println(s);
	}
} 

public class Faculty extends Employee{
	public static void main(String []args){
		new Faculty();
	}
	public Faculty(){
		System.out.println("(4) Performs Faculty's tasks");
	}
}