/*
 * 关于Integer中常用的方法
 */
public class IntegerTest03 {

	public static void main(String argv[]){
		//int --> Integer
		//基本数据类型转换成——>引用类型
		Integer i1 = new Integer(10);
		
		//Integer--> int 
		int i2 = i1.intValue();
		System.out.println(i2+1);
		
		//重要：static int parseInt(String s);
		//String --> int
		int age = Integer.parseInt("25");
		System.out.println(age+1);
		
		//"abc"这个字符串必须是“数字格式”
		
		//重要：static double parseDouble(String s);
		double price = Double.parseDouble("3.0");
		System.out.println(price+1.0);
		
		//将int类型的十进制转换成2进制
		String s1=Integer.toBinaryString(10);
		System.out.println(s1);
		
		//将int类型的十进制转换成16进制
		String s2 = Integer.toHexString(10);
		System.out.println(s2);
		
		//将int类型的十进制转换成8进制
		String s3 = Integer.toOctalString(10);
		System.out.println(s3);
		
		//将int-->Integer
		Integer i = Integer.valueOf(10);
		System.out.println(i);
		
		//String -->Integer
		Integer j = Integer.valueOf("10");
		System.out.println(j);
		
		
	}
}
