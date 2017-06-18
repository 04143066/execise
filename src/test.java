
public class test {

	public static void main(String[] args) {
		TT tt = new TT();
	}
}

class TT{

	public TT() {
		System.out.println("构造方法");
	}
	
	static {
		System.out.println("static");
	}
	
}