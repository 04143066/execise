package Reflect;

import java.util.Date;

/*
 * ����java�еĿα䳤����
 */
public class kebianchangcanshu {

	public static void main(String[] args) {
		m1();
		m1(1);
		m1(1,2);
		m1(3,4,5,6,7);
		m2("����","����","����","��ʳ");
		
		String[] s ={"����","����","����","��ʳ"};
		m2(s);
		try {
			m3(Date.class,Employee.class);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void m1(int... a){//m1 �����ڵ��õ�ʱ�򴫵ݵ�ʵ����0����N��
		System.out.println("test");
	}
	
	//����п��Ծ�ȷƥ��ķ���������ø÷�����������ȥִ�пɱ䳤�������Ǹ�����
	public static void m1(int i){
		System.out.println(i);
	}
	
	//�ɱ䳤�������Ե�ͬ��������
	public static void m2(String... args){
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		System.out.println();
	}

	public static void m3(Class... args) throws InstantiationException, IllegalAccessException{
		for(int i=0; i<args.length; i++){
			Class c = args[i];
			System.out.println(c.newInstance());
		}
	}
	
	public static void m4(int i,String... a){//�ɱ䳤����ֻ�ܳ���һ�Σ������������в��������һλ
		
	}
	
}





















