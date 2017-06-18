/*
 * 面试题
 */
public class StringTest03 {
	
	public static void main(String argv[]){
		//判断以下程序创建了几个对象？
		String s1 = new String("hello");
		String s2 = new String ("hello");
		//堆中有2个
		//常量池中一个
		//一共3个
	}
}
