package Set;
/*
 * SortedSet 集合存储元素为什么可以自动排序？
 * 		因为被存储的元素实现了Comparable接口，
 * 		SUN编写了TreeSet集合在添加元素的时候，会调用
 * 		compareTo方法
 */
import java.util.*;

public class SortedSetTest02 {
	
	public static void main(String argv[]){
		SortedSet s = new TreeSet();
		
		User u1 = new User(1);
		User u2 = new User(2);
		User u3 = new User(3);
		User u4 = new User(4);
		User u5 = new User(5);
	
		s.add(u1);
		s.add(u2);
		s.add(u3);
		s.add(u4);
		s.add(u4);
		
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

class User implements Comparable{
	int age;
	
	User(int age){
		this.age = age;
	}
	
	public String toString(){
		return "User[age="+age+"]";
	}

	
	//按照user的年龄排序，编写一个比较规则
	@Override
	public int compareTo(Object o) {
		int age1 = this.age;
		int age2 = ((User)o).age;
		return age1-age2;
	}
}
