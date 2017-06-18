/*
 * jdk5.0新特性：
 *   一下的特性适合jdk1.5版本之后的。包括1.5
 *   jdk1.4， 包括1.4在内之前的所有版本不能用以下特性
 *   
 *   自动装箱（auto_boxing）和自动拆箱（auto_unboxing）
 */
public class IntegerTest05 {

	public static void main(String argv[]){
		//jdk5.0之前
		
		// int --> Integer(装箱)
		Integer i1 = new Integer(10);
		//Integer --> int (拆箱）
		int i2 = i1.intValue();
		//JDK5.0之后，包括5.0
		Integer i3= 10;//自动装箱
		int i4 = i3;//自动拆箱
		
		System.out.println(i3);
		System.out.println(i4+1);
		
		m1(123);//自动装箱
		System.out.println(m2(10,5)+1);//自动装箱
	}
	
	public static void m1(Object o){
		System.out.println(o);
	}
	
	public static int m2(Integer i1, Integer i2){
		return i1-i2;//自动拆箱
	}
}
