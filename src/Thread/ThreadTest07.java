package Thread;

public class ThreadTest07 {

	public static void main(String[] args) throws InterruptedException {
		//�����߳�
		Thread t = new Processor3();
		t.setName("t");
		
		//�����߳�
		t.start();
		
		//����
		//Thread.sleep(5000);
		t.sleep(5000);//��������main����
		System.out.println("HelloWorld");
	}
}

class Processor3 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}