package Map;

import java.util.*;

/*
 * SortedMap �е�key�ص㣺 �����ظ������Ǵ��ȥ��Ԫ�ؿ��԰��մ�С�Զ�����
 * 
 * ������Զ�����key ���ֵ�Ԫ����Ҫ�� 1��ʵ��Comparable�ӿ�      2.����дһ���Ƚ���
 */
public class SortedMapTest01 {
	
	//Map,key �洢Product��value�洢����
	public static void main(String argv[]){
		//SortedMap  products = new TreeMap();
		
		SortedMap  products = new TreeMap(new ProductsComparator());
		
		Product p1 = new Product("zxx1",234.1);
		Product p2 = new Product("zxx2",232.1);
		Product p3 = new Product("zxx3",231.1);
		Product p4 = new Product("zxx4",254.1);
		
		//Map�� key�洢Product��value�洢����
		products.put(p1,8.0);//8.0�Զ�װ��
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
	
	//ʵ��compareTo����
	//���󣺰�����Ʒ�۸�����
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
	
	//ʵ��compareTo����
	//���󣺰�����Ʒ�۸�����
	
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