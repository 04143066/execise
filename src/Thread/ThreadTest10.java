package Thread;
/*
 * Thread.yield��һ����̬��������λ��ֻ���ͬһ�����ȼ�����λ����λʱ�䲻�̶�
 * ��Sleep������ͬ������ʱ�䲻�̶�
 * 
 * 		Yield��һ����̬��ԭ��(native)����
		Yield���ߵ�ǰ����ִ�е��̰߳����л��ύ���̳߳���ӵ����ͬ���ȼ����̡߳�
		Yield���ܱ�֤ʹ�õ�ǰ�������е��߳�Ѹ��ת���������е�״̬
		������ʹһ���̴߳�����״̬ת��������״̬�������ǵȴ�������״̬
 */
public class ThreadTest10 {

	public static void main(String[] args) {
		Thread t = new Processor();
		t.setName("t");
		t.start();
		//���߳���
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