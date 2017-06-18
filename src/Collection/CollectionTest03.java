package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean contains(Object o)  判断集合中是否包含某个元素
 * boolean remove(Object o);  删除集合中某个元素
 * 
 * 存储在集合中的元素，应该重写equals方法
 */
public class CollectionTest03 {
	
	public static void main(String argv[]){
		//创建集合
		Collection c = new ArrayList();
		
		//创建Integer类型的对象
		Integer i1 = new Integer(10);
		
		//添加元素
		c.add(i1);
		
		//判断集合中是否包含i1
		System.out.println(c.contains(i1));
		
		//创建Integer类型
		Integer i2 = new Integer(10);
		System.out.println(c.contains(i2)); //true   
		
		/*
		 * contains 底层调用的equals方法，因为equals返回true，Integer 重写了equals方法，比较的不是内存地址
		 */
		
		Manager m1 = new Manager(100,"Jack");
		c.add(m1);
		
		Manager m2 = new Manager(100,"Jack");
		System.out.println(c.contains(m2));//重写equals方法之前是false，重写之后是true
		
	}
}


class Manager{
	int no;
	String name;
	
	Manager(int no,String name){
		this.no = no;
		this.name = name;
	}
	
	//需求规定：如果编号和姓名都相同则表示相同
	public boolean equals(Object o){
		if(this == o)  return true;
		if(o instanceof Manager){
			Manager m = (Manager)o;
			if(m.no == this.no && m.name.equals(this.name)){
				return true;
			}
		}
		return false;
	}
	
}



