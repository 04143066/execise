package List;

import java.util.*;

/*
 * 深入List集合
 * 因为ArrayList底层是数组，数组是有下标的
 * 
 * ArrayList集合默认初始化容量是10，扩容之后是原容量的1.5倍
 * 
 * Vector集合默认初始化容量是10，新容量是原容量的2倍
 * 
 * 如何优化ArrayList和vector？
 *   尽量减少扩容操作，因为扩容需要数组拷贝，数组拷贝很耗内存，最好一次给准了
 */
public class ListTest02 {

	public static void main(String argv[]){
		
		//创建list集合
		List l = new ArrayList();//默认长度是10,改成LinkedList下面照样可以执行
		
		//添加元素、
		l.add(123);
		l.add(321);
		l.add(69);
		
		l.add(1,555);
		
		//取得第一元素
		System.out.println(l.get(0));
		System.out.println();
		
		//遍历（List集合特有的遍历方式）
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		System.out.println();
		
		//用迭代器
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
