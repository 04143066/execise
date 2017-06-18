package Map;

import java.util.*;

/*
 * 关于map集合中常用的方法
 * 	void clear(); 清空Map
 * 	boolean containKey(Object key); 判断Map中是否包含这样的key
 * 	boolean containValue(Object value);判断Map中是否含这样的value
 * 	
 * 	Set<Map.Entry<k,v>> entrySet(); 返回此映射中包含的映射关系的Set视图
 * 	
 * Object get(Object key); 通过key获取value
 * Object put(Object key,Object value);向集合中添加键值对
 * 
 * boolean isEmpty(); 判断该集合是否为空
 * Object remove（Object key）; 通过key将键值对删除
 * int size();获取Map中键值对的个数
 * 
 * Set keySet(); 获取Map中所有的key
 * Collection value(); 获取Map集合中所有的value
 * 	
 * 
 * 
 * 存储在Map集合中的key部分的元素需要同时重写hashCode和equals方法
 */
public class MapTest01 {

	public static void main(String argv[]){
		//创建Map集合
		Map persons = new HashMap();//初始化容量16， 默认加载因子0.75
		
		//存储键值对
		persons.put("10000", "Jack");
		persons.put("10011", "Jack1");
		persons.put("10002", "Jack2");
		persons.put("10003", "Jack3");
		persons.put("10000", "Jack4");
		
		//判断键值对的个数
		//Map中的key是不可以重复的，和hashSet相同
		System.out.println(persons.size());
		
		
		//判断集合中是否包含这样的key
		System.out.println(persons.containsKey("10000"));//true
		System.out.println(persons.containsValue("Jack"));//false  当key值重复，他的value值被覆盖了
		System.out.println(persons.containsValue("Jack4"));//true
		
		//通过key获取value
		String k = "10011";
		Object v = persons.get(k);
		System.out.println(v);
		
		//通过key删除键值对
		persons.remove("10003");
		System.out.println(persons.size());
		
		//获取所有的value
		Collection values = persons.values();
		Iterator it = values.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//获取所有的key
		Set keys = persons.keySet();
		it = keys.iterator();
		while(it.hasNext()){
			
			k = (String) it.next();
			v = persons.get(k);
			System.out.println(k+"---->"+v);
		}
		
		//entrySet
		Set entryset = persons.entrySet();
		Iterator it3 = entryset.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next());
		}
	}
}
























