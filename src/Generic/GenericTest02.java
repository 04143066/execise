package Generic;

import java.util.*;

/*
 * Map使用泛型
 */
public class GenericTest02 {

	public static void main(String argv[]){
		Map<String,Integer> maps = new HashMap<String,Integer>();
		
		//存
		maps.put("s", 10);
		maps.put("d", 9);
		maps.put("g", 17);
		maps.put("2", 3);
		
		//遍历
		Set<String> set = maps.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String k =  it.next();
			Integer v = maps.get(k);
			System.out.println(k+"-->"+v);
		}
	}
}
