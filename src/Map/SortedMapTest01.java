package Map;

import java.util.*;

/*
 * SortedMap 中的key特点： 无序不重复，但是存进去的元素可以按照大小自动排序。
 * 
 * 如果想自动排序：key 部分的元素需要， 1，实现Comparable接口      2.单独写一个比较器
 */
public class SortedMapTest01 {
	
	//Map,key 存储Product，value存储个数
	public static void main(String argv[]){
		//SortedMap  products = new TreeMap();
		
		SortedMap  products = new TreeMap(new ProductsComparator());
		
		Product p1 = new Product("zxx1",234.1);
		Product p2 = new Product("zxx2",232.1);
		Product p3 = new Product("zxx3",231.1);
		Product p4 = new Product("zxx4",254.1);
		
		//Map的 key存储Product，value存储重量
		products.put(p1,8.0);//8.0自动装箱
		products.put(p2,3.0);
		products.put(p3,4.0);
		products.put(p4,10.0);
		
		Set keys = products.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()){
			Object k = it.next();
			Object v = products.get(k);
			System.out.println(k+"-->"+v+"kg");
		}
		
	}
}

/*class Product implements Comparable{
	String name;
	double price;
	 
	Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String toString(){
		return "product[name="+name+",price="+price+"]";
	}
	
	//实现compareTo方法
	//需求：按照商品价格排序
	public int compareTo(Object o){
		if(this.price > ((Product)o).price)
			return 1;
		else if(this.price < ((Product)o).price)
			return -1;
		else
			return 0;
	}
}*/

class Product{
	String name;
	double price;
	 
	Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String toString(){
		return "product[name="+name+",price="+price+"]";
	}
	
	//实现compareTo方法
	//需求：按照商品价格排序
	
}


class ProductsComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		if(((Product)arg0).price > ((Product)arg1).price)
			return 1;
		else if(((Product)arg0).price < ((Product)arg1).price)
			return -1;
		else
			return 0;
	}
	
}