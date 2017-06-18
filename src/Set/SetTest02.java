package Set;

import java.util.*;

/*
 * 关于往Set集合中存储的元素，该元素的hashCode和equals方法
 * 
 * HashMap中有一个put方法，put（key，value）key是无序不可重复
 * 
 * 注意 存储在HashSet或HashMap中的元素， Employee重写hashCode,euqals方法
 */
public class SetTest02 {

	public static void main(String[] args) {
		//创建集合
		Set es = new HashSet();
		
		Employee e1 = new Employee("1000","Jack");
		Employee e2 = new Employee("1000","Jack");
		Employee e3 = new Employee("1000","Jack2");
		Employee e4 = new Employee("2001","Jack3");
		Employee e5 = new Employee("3000","Jack4");
		Employee e6 = new Employee("3001","Jack5");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		//添加元素
		es.add(e1);
		es.add(e2);//不会异常
		es.add(e3);
		es.add(e4);
		es.add(e5);
		es.add(e6);
		
		System.out.println(es.size());
	}

}


//根据现实的业务逻辑得知：该公司员工编号是1000 - 9999
class Employee{
	//编号
	String no;
	//姓名
	String name;
	
	Employee(String no, String name){
		this.no = no;
		this.name = name;
	}
	
	//重写equals方法，如果员工的编号和姓名相同则是同一个对象
	public boolean equals(Object o){
		if(this ==o){
			return true;
		}
		if(this instanceof Employee){
			Employee e = (Employee)o;
			if(e.name == this.name && e.no == this.no){
				return true;
			}
		}
		return false;
	}
	
	//重写hashCode方法  注意散列分布分配
	public int hashCode(){
		//以员工编号分组
		return no.hashCode();//把String类型转换成int型,如果员工编号一样就进入equals
	}
	
}