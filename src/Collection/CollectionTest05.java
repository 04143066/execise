package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *   深入 remove方法
 *   
 *     1.迭代器的remove方法
 *     2.集合自带的remove方法
 */
public class CollectionTest05 {

	public static void main(String argv[]){
		Collection c = new ArrayList();
		
		c.add(1);
		c.add(2);
		c.add(3);
		
		//遍历
		Iterator it = c.iterator();
		while(it.hasNext()){
			//方法一
			it.next();
			//删除
			it.remove();//通过迭代器删除
		
			
			//方法二（会报异常）
			//使用集合自身所带的remove方法
			//Object element = it.next();
			//删除
			//c.remove(element);
		}
		
		
		System.out.println(c.size());
	}
}
