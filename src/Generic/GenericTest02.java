package Generic;

import java.util.*;

/*
 * Mapʹ�÷���
 */
public class GenericTest02 {

	public static void main(String argv[]){
		Map<String,Integer> maps = new HashMap<String,Integer>();
		
		//��
		maps.put("s", 10);
		maps.put("d", 9);
		maps.put("g", 17);
		maps.put("2", 3);
		
		//����
		Set<String> set = maps.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String k =  it.next();
			Integer v = maps.get(k);
			System.out.println(k+"-->"+v);
		}
	}
}
