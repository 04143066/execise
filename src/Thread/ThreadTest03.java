package Thread;
/*
 * java中实现线程的第二种方式：
 * 		第一步：写一个类实现java.lang.Runnable;接口
 * 		第二步：实现run()方法		
 */

//首选这种方式，因为一个类实现接口之外，还保留了继承
public class ThreadTest03 {

	public static void main(String[] args) {
		//创建线程
		Thread t = new Thread(new Processors());
		//启动
		t.start();
	}
}

class Processors implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println("run-->"+i);
		}
	}
}
