/*
 * java中八种基本数据类型对应的包装类型：
 * 	基本数据类型                            包装类型
 *  byte             java.lang.Byte;
 *  short            java.lang.Short;
 *  int              java.lang.Integer;
 *  long             java.lang.Long;
 *  
 *  float            java.lang.Float;
 *  double           java.lang.Double;
 *  
 *  boolean          java.lang.Boolean;   
 *  
 *  char             java.lang.Character;
 *  
 *  思考：java中提供的八种基本数据类型不够用吗？为什么java中还要提供对应的包装类呢？
 *  	方便，Object是引用类型，在用Object传参时，不能用byte，short等，必须要用他们
 *      的包装类型。
 */
public class IntegerTest01 {

	//需求：规定m1方法可以接受java中的任何一种数据类型
	public static void m1(Object o){
		System.out.println(o);
	}
	
	//入口
	public static void main(String argv[]){
		//基本数据类型
		byte b = 10;
		
		//引用类型
		Byte  b1 = new Byte(b);
		m1(b1);    //10  Byte已经将Object的toString 方法重写了
	}
}
