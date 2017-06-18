package Reflect;

public class Employee {

	//Field
	private String name;
	
	//Constructor
	public Employee(){
		System.out.println("Employee无参构造方法被执行。。。");
	}
	
	public Employee(String name){
		this.name = name;
	}
	
	//方法
	public void work(){
		System.out.println(name);
	}
}
