package Generic;

public class GenericTest04 {

	public static void main(String argv[]){
		Myclass<String>  m = new Myclass<String>();
		m.m1("woshizxx");
	}
}

class Myclass<T>{
	
	public void m1(T t){
		System.out.println(t);
	}
}
