package Decorator;

public class Test {

	public static void main(String args[]){
		//1.创建被装饰者
		FileReader fr = new FileReader();
		
		//2.创建装饰者
		BufferedReader br = new BufferedReader(fr);
		
		//3.通过执行装饰者中的方法间接执行被装饰者中的方法
		br.close();
	}
}
