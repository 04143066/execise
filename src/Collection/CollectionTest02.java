package Collection;

import java.util.*;

/*
 * Iterator iterator(); 获取集合所依赖的迭代器
 * 通过迭代器中方法完成集合的遍历
 * 
 * 注意：这种方式是所有集合通用的遍历方式
 */
public class CollectionTest02 {

	public static void main(String argv[]){
		
		//1.创建集合对象
		Collection c = new LinkedList();
		Collection c1 = new ArrayList();
		
		//2.添加元素
		c.add(100);
		c.add(3.14);
		c.add(false);
		
		//3.迭代，遍历
		//获取迭代器对象
		Iterator it = c.iterator();//迭代器是面向接口编程  it是引用，保存了内存地址，指向堆中“迭代器的对象”
		Iterator it1 = c1.iterator();
		
		System.out.println(it);
		System.out.println(it1);
		
		//调用方法,完成迭代遍历
		
		//it.hasNext() 判断是否有下一个元素，如果有返回true，
		while(it.hasNext()){
			Object o = it.next();//将迭代器往下移动一个，再调用it.next()之前必须先调用，
			System.out.println(o);
		}
		
		for(Iterator it2 = c.iterator(); it2.hasNext();){
			Object u = it2.next();
			System.out.println(u);
		}
		
	}
	
}













