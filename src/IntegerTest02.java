/*
 * 以java.lang.Iteger;类型为例，讲解八种类型
 */
public class IntegerTest02 {

	public static void main(String argv[]){
		//获取int类型的最大值和最小值
		System.out.println("int最小值："+Integer.MIN_VALUE);
		System.out.println("int最大值:"+Integer.MAX_VALUE);
		
		//以int推byte
		System.out.println("byte最小值:"+Byte.MIN_VALUE);
		System.out.println("byte最大值:"+Byte.MAX_VALUE);
		
		//创建Integer类型的对象
		Integer i1 = new Integer(10);//int --> Integer
		Integer i2 = new Integer("123");//String --> Integer
		
		System.out.println(i1);
		System.out.println(i2);
		
		Integer i3 = new Integer("abc");//能通过编译，但运行会报异常，必须是字符串数字
	}
}
