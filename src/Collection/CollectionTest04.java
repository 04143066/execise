package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean remove(Object o)
 * 
 *   remove 和   contains 元素都需要重写equals方法，如果不重写则比较的是内存地址
 *
 */
public class CollectionTest04 {

	public static void main(String argv[]){
		//创建集合对象
		Collection c = new ArrayList();
		
		Integer i1 = new Integer(10);
		
		//添加元素
		c.add(i1);
		
		//删除
		Integer i2 = new Integer(10);
		c.remove(i2);
		
		System.out.println(c.size());//0
		
		Manager m1 = new Manager(100,"Smith");
		c.add(m1);
		
		Manager m2 = new Manager(100,"Smith");
		c.remove(m2);
		
		System.out.println(c.size());//0
	}
}
