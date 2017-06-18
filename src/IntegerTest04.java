/*
 * Integer 
 * int 
 * String
 * 三种类型相互转换
 */
public class IntegerTest04 {

	public static void main(String[] args){
		//1.int --> Integer
		Integer i1 = Integer.valueOf(10);
		
		//2.Integer --> int
		int i2 = i1.intValue();
		
		//3.String --> Integer
		Integer i3 = Integer.valueOf("10");
		
		//4.Integer --> String
		String i4 = i3.toString();
		
		//5.String -->int
		int i5 = Integer.parseInt("123");
		
		//6.int -->String
		String s2 = 10 + "";
	}
}
