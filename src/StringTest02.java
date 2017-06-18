/*
 * 分析以下程序创建字符串对象的区别
 * 1.String s1 = "abc"; 只会在字符串常量池中创建一个“abc”字符串对象
 * 2.String s2 = new String("hello"); 会在字符串常量池中创建一个“hello”字符串
 *  对象，并且会在堆中创建一个字符串对象，第二种比较浪费内存，常用的是第一种方式。
 */
public class StringTest02 {

	public static void main(String argv[]){
		String s1="abc";
		String s2= new String("abc");  //在堆内存中创建一个对象，不使用字符串常量池中已经存在的“abc”
	}
}
