package List;

import java.util.*;

/*
 *   List���ϴ洢Ԫ�ص��ص�
 *   1.����List�����д洢���±꣩�����ȥ��������˳��ȡ�������ǰ������˳��ȡ��
 *   2.���ظ�
 * 
 */
public class ListTest01 {

	public static void main(String argv[]){
		//����һ��List����
		//Collection c = new ArrayList();
		//c.get();   �ᱨ��ģ���ΪCollection �����������û��get������list����
		
		List l = new ArrayList();
		l.add(100);
		l.add(99);
		l.add(23);
		l.add(250);
		
		//����
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}
}
