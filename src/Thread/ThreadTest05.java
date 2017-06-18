package Thread;
/*
 * �߳����ȼ��ߵĻ�ȡ��cpuʱ��Ƭ�����˵��һЩ
 * 	���ȼ���1-10
 * 		���1�����10��Ĭ��5 
 */
public class ThreadTest05 {

	public static void main(String[] args) {
		Thread t1 = new Processor1();
		t1.setName("t1");
		
		Thread t2 = new Processor1();
		t2.setName("t2");
		
		System.out.println(t1.getPriority());
		
		t1.setPriority(4);
		t2.setPriority(6);//���ȼ��ߣ��Ƚ���
		
		//�����߳�
		t1.start();
		t2.start();
	}
}

class Processor1 extends Thread{
	public void run(){
		for(int i=0; i<50; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}