package IO;

import java.io.Serializable;//该接口是一个可序列化的，   该接口没有任何方法，是一个标志性接口 ，
                            //像这样的接口还有：java.lang.Cloneable;
/*
 * 标志性接口的作用：起到标志的作用
 * JVM如果看到该类实现了标识性接口，就特殊待遇
 * 
 * 疑问:User 实现 Serializable 接口，JVM对它特殊待遇：在序列化存储User时会给他分配一个版本序列号 serialVersionUID，
 * 但是当你把这个user类更新改变之后，再次反序列化时就会版本序列号匹配发生异常，所以在建User类时，就自己写一个版本号
 * 这样系统就不会自动分配导致异常了
 */
public class User implements Serializable{

	String name;
	int age;
	//private static final long serialVersionUID = 7938342973138034619L;
	User(String name){
		this.name = name;
	}
	
	public String  toString(){
		return name;
	}
}
