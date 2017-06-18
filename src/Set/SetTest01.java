package Set;

import java.util.*;

/*
 * set集合:
 * 	1.HashSet底层实际上是一个HashMap，HashMap的底层采用了hash表表数据结构，数组和单向链表的结合。
 *  2.哈希表又叫散列表，哈希表底层是一个数组，这个数组中每一个元素是一个单向链表。
 *  每个单向链表都有一个独一无二的hash值，代表数组的下标。在某个单向链表中的每一个节点
 *  上的hash值是相等的。hash值实际上是key调用Hashcode方法，在通过“hash function”
 *  转换成的值。
 *  3.在哈希表中添加元素，如果调用equals方法，带添加元素的key等于散列表中的某个元素的key则放弃添加
 *  
 *  
 *  4.无序，不重复，hashMap中的key符合hashset的特性
 *  
 *  5.HashSet 和 HashMap初始化容量都是16，默认加载因子都是0.75
 */
public class SetTest01 {

	public static void main(String argv[]){
		Set s = new HashSet();//底层的数组初始化容量是 16   ，默认加载因子是0.75,（100的数组，到了75就扩容）
		
		//无序不可重复
		s.add(1);
		s.add(1);  //没有异常，但加不进去 
		s.add(100);
		s.add(85);
		s.add(88);
		
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}
