package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean contains(Object o)  �жϼ������Ƿ����ĳ��Ԫ��
 * boolean remove(Object o);  ɾ��������ĳ��Ԫ��
 * 
 * �洢�ڼ����е�Ԫ�أ�Ӧ����дequals����
 */
public class CollectionTest03 {
	
	public static void main(String argv[]){
		//��������
		Collection c = new ArrayList();
		
		//����Integer���͵Ķ���
		Integer i1 = new Integer(10);
		
		//���Ԫ��
		c.add(i1);
		
		//�жϼ������Ƿ����i1
		System.out.println(c.contains(i1));
		
		//����Integer����
		Integer i2 = new Integer(10);
		System.out.println(c.contains(i2)); //true   
		
		/*
		 * contains �ײ���õ�equals��������Ϊequals����true��Integer ��д��equals�������ȽϵĲ����ڴ��ַ
		 */
		
		Manager m1 = new Manager(100,"Jack");
		c.add(m1);
		
		Manager m2 = new Manager(100,"Jack");
		System.out.println(c.contains(m2));//��дequals����֮ǰ��false����д֮����true
		
	}
}


class Manager{
	int no;
	String name;
	
	Manager(int no,String name){
		this.no = no;
		this.name = name;
	}
	
	//����涨�������ź���������ͬ���ʾ��ͬ
	public boolean equals(Object o){
		if(this == o)  return true;
		if(o instanceof Manager){
			Manager m = (Manager)o;
			if(m.no == this.no && m.name.equals(this.name)){
				return true;
			}
		}
		return false;
	}
	
}



