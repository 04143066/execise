package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *   ���� remove����
 *   
 *     1.��������remove����
 *     2.�����Դ���remove����
 */
public class CollectionTest05 {

	public static void main(String argv[]){
		Collection c = new ArrayList();
		
		c.add(1);
		c.add(2);
		c.add(3);
		
		//����
		Iterator it = c.iterator();
		while(it.hasNext()){
			//����һ
			it.next();
			//ɾ��
			it.remove();//ͨ��������ɾ��
		
			
			//���������ᱨ�쳣��
			//ʹ�ü�������������remove����
			//Object element = it.next();
			//ɾ��
			//c.remove(element);
		}
		
		
		System.out.println(c.size());
	}
}
