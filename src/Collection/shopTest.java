package Collection;

import java.util.*;
import java.util.Map.Entry;

public class shopTest {

	public static void main(String argv[]){
		ShopingCart sc = new ShopingCart();
		Product per1 = new Product("1000","1wea",32.0);
		Product per2 = new Product("2000","2wea",31.0);
		Product per3 = new Product("3000","3wea",23.0);
		sc.add(per1,7);
		sc.add(per2);
		sc.add(per3);
		sc.remove(per1,3);
		sc.remove(per2,1);
		sc.print();
	}
}

class ShopingCart{
	
	Map<Product,Integer> productMaps;
	Set<Product> pro;
	Iterator<Product> it; 
	ShopingCart(){
		productMaps = new HashMap<Product,Integer>();
		pro = productMaps.keySet();
	}
	
	//对外提供方法
	void add(Product p){
		this.add(p,1);
	}
	
	void add(Product p,int n){
		int num = 0;
		it = pro.iterator();
			while(it.hasNext()){
				Product p1 = it.next();
				if(p.equals(it)){				
					num = productMaps.get(p1);
				}
			}
		productMaps.put(p,num+n);
	}
	
	void remove(Product p,int n){
		it = pro.iterator();
		int num = 0;		
		while(it.hasNext()){
			Product p1 = it.next();
			if(p.no.equals(p1.no)){			
				num = productMaps.get(p1);
				//System.err.println("num="+num);
			}
		}
		if(num>n)
			productMaps.put(p,num-n);
		else if(num==n){
			productMaps.remove(p);
		} else{
			try {
				throw new Exception("删除失败");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	void remove(Product p){
		this.remove(p,1);
	}
	
	void clear(){
		productMaps.clear();
	}
	
	void print(){
		Set<Entry<Product, Integer>> EntrySet = productMaps.entrySet();
		Iterator<Entry<Product, Integer>> it = EntrySet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

class Product{
	String no;
	String name;
	double price;
	Product(String no,String name,double price){
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public boolean equals(Object o){
		if(this == o) 
			return true;
		if(o instanceof Product){
			Product p = (Product)o;
			if(this.no.equals(p.no)) 
				return true;
		}
		return false;
	}
	public int hashCode(){
		return no.hashCode();
	}
	public String toString(){
		return "["+no+","+name+","+price+"]";
	}

}

