/*
 * java.lang.String;是字符串类型
 * 1.字符串一旦创建不可被改变。"abc"字符串一旦创建，不可再改变成“abcd”
 * 2.提升字符串的访问率：在程序中使用"缓存"技术.所以在java中所有使用双引号括起来的
 *	 的字符串都会在"字符串常量池(不可再改变)"中创建一份。字符串常量池在方法区中被存储。
 * 3.在程序执行过程中，如果程序用到某个字符串，例如“abc”，那么程序在字符串常量池
 * 	中去搜索该字符串，如果没有找到则在字符串常量池中新建一个“abc”字符串，如果找到了
 *  就直接拿来用。字符串常量池是一个缓存区，为了提高字符串的访问效率
 *
 */
public class StringTest01 {

	public static void main(String argv[]){
		//创建一个“abc"字符串对象，该对象的内存地址，让s1变量保存
		//s1是一个引用，s1指向“abc”对象
		String s1="abc";
		//可以让s1重新指向吗？s1是局部变量，s1前边没有final，所以s1可以重新指向
		//但是“def”字符串本身不可变
		s1="def";
		
		String s3 ="hello";//在字符串常量池中新建一个“hello”字符串对象，该对象不可变
		String s2 = "hello";//从字符串常量池中直接拿来用
		
		System.out.println(s2==s3);
		
		//比较两个字符串是否相等不能用“==”
		String s4 = new String("abc");// new 是在堆内存中开辟一块空间
		String s5 = new String("abc");// 开辟另一块空间
		
		System.out.println(s4==s5);//false ,因为他们的内存地址不相同
		
		//比较两个字符串是否一致必须使用String类型提供的equals方法
		System.out.println(s4.equals(s5));//true  equals来自于object方法，他比较的是内存地址，但String重写了此方法
		       
		//一下程序执行结束之后，会在字符串常量池中创建3个字符串
		String s6 = "aaa";
		String s7 = "bbb";
		String s8 = s7+s6;
		//"aaa" "bbb" "aaabbb"
	}
}
