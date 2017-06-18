/*
 * java.lang.StringBuffer;
 * java.lang.StringBuilder;
 * 
 * 	1.StringBuffer是什么？
 *   是一个字符串缓冲区
 *   
 *  2.工作原理
 *   预先在内存中申请一块空间，以容纳字符序列，
 *   如果预留的空间不够用，则进行自动扩容，以
 *   容纳更多字符串序列。
 *  
 *  3.StringBuffer ,StringBuilder 和String的最大区别？
 *   String 是不可变的字符序列，存储在字符串常量池中
 *   StringBuffer 底层是一个char数组，但是该char数组时可变得。
 *   并可以自动扩容。
 *   
 *  4.StringBuffer 和StringBuilder的默认初始化容量是16
 *  
 *  5.如何优化StringBuffer 和 StringBuilder 呢？
 *  	最好在创建StringBuffer之前预测StringBuffer的存储字符数量
 *  	然后在创建StringBuffer的时候采用指定初始化容量的方式创建StringBuffer。
 *      为了减少底层的数组拷贝，提高效率
 *      
 *  6.StringBuffer 和 StringBuilder的区别？
 *  	StringBuffer是线程安全的。（可以在多线程的环境下使用不会出现问题。）
 *  	StringBuilder是非线程安全的。（在多线程环境下使用可能出现问题）
 */
public class StringBuffTest01 {
	
	public static void main(String argv[]){
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		//可以向StringBuffer中追加字符串,如果使用String会创建大量的对象
		String[] ins ={"体育","音乐","美食","睡觉"};
		
		for(int i=0; i<ins.length; i++){
			if(i == ins.length-1)
				sb.append(ins[i]);
			else{
				sb.append(ins[i]);
				sb.append(",");
			}			
		}
		System.out.println(sb);
	}
}

