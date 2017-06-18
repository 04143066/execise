/*
	动态初始化一维数组
	1.动态出事一维数组，会先在堆内存中分配这个数组，并且数组中每一个元素都采用默认值
	byte,short,int,long 0
	float double 0.0
	boolean false
	char /u0000
	引用 null
*/

public class Arraytest03{

	public static void main(String[] args){
		//动态声明一个int型的数组，最多可以存储4个元素
		int[] a1 = new int[4];

		//遍历
		for(int i=0; i<a1.length; i++){
			System.out.println(a1[i]);
		}
		//赋值
		a1[0] = 2;
		a1[1] = 3;
		a1[2] = 3;

		//引用类型的数组
		Object[] objs = new Object[3];
		for(int index=0; index<objs.length; index++){
			Object o = objs[index];
			//o.tostring(); //注意控制针异常，因为引用类型的默认值是null
			System.out.println(o);
		}
	}
}

/*
	public void println(Object x){
		Strings = String.valueOf(x);
		synchronized(this){
			print(s);
			newLine();
		}
	}


	public static String valueOf(object obj){
		return (obj == null) ? "null":obj.toString();
	}
*/