package Thread;
/*
 * 1.ʲô�ǽ��̣�
 * 		һ�����̶�Ӧһ��Ӧ�ó���
 * 		���磺��windows����ϵͳ������Word�ͱ�ʾ�������˽��̡���Java��
 * 		��������������JVM���ͱ�ʾ������һ�����̡��ִ��ļ��������֧�ֶ��̵߳�
 * 		����ͬһ������ϵͳ�У�����ͬʱ����������̡�
 * 2.�������ʲô���ã�
 * 		�����̵ļ��������ͬʱ���������顣���ڵ��˼������������ͬһ��ʱ���ϣ�
 * 		��Ϸ���̺����ֽ���ͬʱ�������𣿲��ǣ���Ϊ���������л����ٶȼ��졣����̲���
 * 		���ִ���ٶȣ��������cpu��ʹ���ʡ�
 * 
 * 3.���̺ͽ���֮����ڴ��Ƕ�������Ϸ�ڴ�������̷ֱ߳�ռ�ò�ͬ���ڴ档
 * 
 * 4.ʲô���̣߳�
 * 		�߳���һ�������е�ִ�г�����һ�����̿�����������̡߳�
 * 
 * 5.���߳���ʲô���ã�
 * 		���̲߳���Ϊ�����ִ���ٶȣ��������Ӧ�ó����ʹ���ʡ�
 * 		�̺߳��̹߳��������ڴ�ͷ������ڴ桱��ջ�ڴ��Ƕ����ģ�һ���߳�һ��ջ��
 * 		���Ը���ʵ�����е�����һ�ִ������о�����߳���ͬʱ����ִ�С�
 * 
 * 6.java���������ԭ����
 * 		java���������java�����������JVM�͵���������һ��Ӧ�ó��򣬱�ʾ����
 * 		��һ�����̡��ý��̻��Զ����������̡߳���Ȼ�������̻����ĳ�����main������
 * 		����main�������������߳��У��ڴ�֮ǰ���ǵ��̵߳�
 */


//  ���³���main,m1,m2,m3,��ͬһ��ջ�ڴ���
public class ThreadTest01 {
	
	public static void main(String[] args) {
		m1();
	}
	
	public static void m1(){
		m2();
	}
	
	public static void m2(){
		m3();
	}
	public static void m3(){
		System.out.println("m3....");
	}
}