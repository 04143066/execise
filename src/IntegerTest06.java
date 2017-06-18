/*
 * 深入自动拆箱和自动装箱：
 * 	1.自动装箱和自动拆箱是程序编译阶段的一个概念
 *    和程序的运行无关
 *  2.自动拆箱和自动装箱主要是方便程序员编码
 *  
 */
public class IntegerTest06 {

	public static void main(String argv[]){
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		//这里不会有拆箱，引用和引用比较不会有拆箱
		System.out.println(i1==i2);//false  两次的内存地址不一样，所以是false
		
		//比较两个Integer类型的数据是否相等，不能用“==”
		System.out.println(i1.equals(i2));//true Integer 已经重写了object中的equals方法
		
		//重点：
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);//false
		
		
		//注意一下程序,如果数据在[-128,127]，java引入了一个“整型常量池”,在方法区中
		//该整型常量池只存储-128~127之间的数据
		
		Integer i5 = 127;//这个程序是从方法区中的“整型常量池”
		Integer i6 = 127;
		System.out.println(i5 == i6);//true
		
		Integer i7 = -128;
		Integer i8 = -128;
		System.out.println(i7 == i8);//true
		
		
		
		
		
	}
}
