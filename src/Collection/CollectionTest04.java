package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean remove(Object o)
 * 
 *   remove ��   contains Ԫ�ض���Ҫ��дequals�������������д��Ƚϵ����ڴ��ַ
 *
 */
public class CollectionTest04 {

	public static void main(String argv[]){
		//�������϶���
		Collection c = new ArrayList();
		
		Integer i1 = new Integer(10);
		
		//���Ԫ��
		c.add(i1);
		
		//ɾ��
		Integer i2 = new Integer(10);
		c.remove(i2);
		
		System.out.println(c.size());//0
		
		Manager m1 = new Manager(100,"Smith");
		c.add(m1);
		
		Manager m2 = new Manager(100,"Smith");
		c.remove(m2);
		
		System.out.println(c.size());//0
	}
}
