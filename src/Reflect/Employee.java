package Reflect;

public class Employee {

	//Field
	private String name;
	
	//Constructor
	public Employee(){
		System.out.println("Employee�޲ι��췽����ִ�С�����");
	}
	
	public Employee(String name){
		this.name = name;
	}
	
	//����
	public void work(){
		System.out.println(name);
	}
}
