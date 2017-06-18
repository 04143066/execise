package Thread;
/*
 * Thread.yield是一个静态方法，让位，只会给同一个优先级的让位，让位时间不固定
 * 和Sleep方法相同，就是时间不固定
 * 
 * 		Yield是一个静态的原生(native)方法
		Yield告诉当前正在执行的线程把运行机会交给线程池中拥有相同优先级的线程。
		Yield不能保证使得当前正在运行的线程迅速转换到可运行的状态
		它仅能使一个线程从运行状态转到可运行状态，而不是等待或阻塞状态
 */
public class ThreadTest10 {

	public static void main(String[] args) {
		Thread t = new Processor();
		t.setName("t");
		t.start();
		//主线程中
		for(int i=0; i<500; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}
 
class Processor6 extends Thread
{
	public void run(){
		for(int i=0; i<1000; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
//			if(i%20 ==0){
//				Thread.yield();
//			}
		}
	}
}