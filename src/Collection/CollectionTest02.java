package Collection;

import java.util.*;

/*
 * Iterator iterator(); ��ȡ�����������ĵ�����
 * ͨ���������з�����ɼ��ϵı���
 * 
 * ע�⣺���ַ�ʽ�����м���ͨ�õı�����ʽ
 */
public class CollectionTest02 {

	public static void main(String argv[]){
		
		//1.�������϶���
		Collection c = new LinkedList();
		Collection c1 = new ArrayList();
		
		//2.���Ԫ��
		c.add(100);
		c.add(3.14);
		c.add(false);
		
		//3.����������
		//��ȡ����������
		Iterator it = c.iterator();//������������ӿڱ��  it�����ã��������ڴ��ַ��ָ����С��������Ķ���
		Iterator it1 = c1.iterator();
		
		System.out.println(it);
		System.out.println(it1);
		
		//���÷���,��ɵ�������
		
		//it.hasNext() �ж��Ƿ�����һ��Ԫ�أ�����з���true��
		while(it.hasNext()){
			Object o = it.next();//�������������ƶ�һ�����ٵ���it.next()֮ǰ�����ȵ��ã�
			System.out.println(o);
		}
		
		for(Iterator it2 = c.iterator(); it2.hasNext();){
			Object u = it2.next();
			System.out.println(u);
		}
		
	}
	
}













