package List;

import java.util.*;

/*
 *   List集合存储元素的特点
 *   1.有序（List集合中存储有下标）：存进去是这样的顺序，取出来还是按照这个顺序取出
 *   2.可重复
 * 
 */
public class ListTest01 {

	public static void main(String argv[]){
		//创建一个List集合
		//Collection c = new ArrayList();
		//c.get();   会报错的，因为Collection 这个集合里面没有get方法，list才有
		
		List l = new ArrayList();
		l.add(100);
		l.add(99);
		l.add(23);
		l.add(250);
		
		//遍历
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}
}
