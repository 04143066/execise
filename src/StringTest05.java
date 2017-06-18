/*
 * 关于字符串常用的方法
 */
public class StringTest05 {
	
	//常用的构造方法
	public static void main(String argv[]){
		String s1 = "abc";
		
		String s2 = new String("abc");
		
		byte[] bytes = {97,98,99,100};
		String s3 = new String(bytes);
		System.out.println(s3);//println里面如果是一个引用类型，会直接调用object的toString方法，然后String重写了toString方法
		
		String s4 = new String(bytes,1,2);
		System.out.println(s4);
		
		char[] c1={'我','是','中','国','人'};
		String s5 = new String(c1);
		System.out.println(s5);//我是中国人
		
		String s6 = new String(c1,2,2);
		System.out.println(s6);//中国
	}
}
