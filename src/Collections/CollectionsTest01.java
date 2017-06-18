package Collections;


import java.util.*;
import java.util.Collections;
/*
 * 关于集合工具类 java.util.Collections;
 *           java.util.Collection;是接口
 *           
 *           
 *      如果创建一个person对象，如果用Collections.sort(List l)进行排序,那么l中的元素person必须是“可比较的”
 *      就是要实现comparable接口
 */
public class CollectionsTest01 {

	//private static final Collections Colletions = null;

	public static void main(String argv[]){
		//使用Collections工具完成集合排序
		List l = new ArrayList();
		
		//添加元素
		l.add(10);
		l.add(9);
		l.add(20);
		l.add(5);
		l.add(30);
		
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		
		System.out.println();
		Collections Colletions = null;
		Colletions.sort(l);
		
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		System.out.println();
		
		//给定set集合
		Set s = new HashSet();
		
		s.add(1);
		s.add(10);
		s.add(9);
		s.add(8);
		
		//不能对set排序
		//Collections.sort(s);
		
		//将Set转换成List
		List lists = new ArrayList(s);
		Collections.sort(lists);
		for(int i=0; i<lists.size(); i++){
			System.out.println(lists.get(i));
		}
		
		//将ArrayList转换成线程安全的。
		List myList= new ArrayList();
		Collections.synchronizedList(myList);
	}
}
