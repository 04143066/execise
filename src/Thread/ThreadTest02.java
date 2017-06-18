package Thread;
/*
 * 		在java语言中实现多进程的第一种方式：
 * 			第一步：继承java.lang.Thread
 * 			第二步：重写run()
 * 
 * 		三个知识点：
 * 		如何定义线程？
 * 		如何创建线程？
 * 		如何启动线程？
 */
public class ThreadTest02 {
	public static void main(String[] args) {
		//创建线程
		Thread  t =  new Processor(); 
		//启动
		t.start();//这段代码执行瞬间结束，告诉JVM再分配一个新的栈给t线程
		          //系统线程启动之后自动调用run()方法
		
		for(int i=0; i<100; i++){
			System.out.println("main-->"+i);
		}
	}
}
//有了多线程后，main方法结束只是主线程栈中没有方法栈帧了
//但是其他程序或者其他栈中可能还有栈帧

//定义一个线程
class Processor extends Thread{
	//重写run方法
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println("run-->"+i);
		}
	}
}
