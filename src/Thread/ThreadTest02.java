package Thread;
/*
 * 		��java������ʵ�ֶ���̵ĵ�һ�ַ�ʽ��
 * 			��һ�����̳�java.lang.Thread
 * 			�ڶ�������дrun()
 * 
 * 		����֪ʶ�㣺
 * 		��ζ����̣߳�
 * 		��δ����̣߳�
 * 		��������̣߳�
 */
public class ThreadTest02 {
	public static void main(String[] args) {
		//�����߳�
		Thread  t =  new Processor(); 
		//����
		t.start();//��δ���ִ��˲�����������JVM�ٷ���һ���µ�ջ��t�߳�
		          //ϵͳ�߳�����֮���Զ�����run()����
		
		for(int i=0; i<100; i++){
			System.out.println("main-->"+i);
		}
	}
}
//���˶��̺߳�main��������ֻ�����߳�ջ��û�з���ջ֡��
//�������������������ջ�п��ܻ���ջ֡

//����һ���߳�
class Processor extends Thread{
	//��дrun����
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println("run-->"+i);
		}
	}
}
