package Generic;

import java.util.*;

/*
 * SortedSet集合使用泛型
 */
public class GenericTest03 {

	public static void main(String argv[]){
		SortedSet<Manager> ss = new TreeSet<Manager>();
		
		Manager m1 =new Manager(5322.3);
		Manager m2 =new Manager(2322.3);
		Manager m3 =new Manager(3122.3);
		Manager m4 =new Manager(3220.3);
		
		ss.add(m1);
		ss.add(m2);
		ss.add(m3);
		ss.add(m4);
		
		Iterator<Manager> it = ss.iterator();
		while(it.hasNext()){
			Manager m = it.next();
			m.work();
			//System.out.println(it.next());
		}
	}
}

class Manager implements Comparable<Manager>{
	double sal;
	
	Manager(double sal){
		this.sal = sal;
	}
	
	public String toString(){//重写toString方法不能加参数
		return sal+"";
	}
	
	public void work(){
		System.out.println("工作，一个月"+sal+"元");
	}

	@Override
	public int compareTo(Manager m) {
		if(this.sal > m.sal)
			return 1;
		else if(this.sal < m.sal)
			return -1;
		else
			return 0;
	}
}
