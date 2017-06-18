package Collections;


import java.util.*;
import java.util.Collections;
/*
 * ���ڼ��Ϲ����� java.util.Collections;
 *           java.util.Collection;�ǽӿ�
 *           
 *           
 *      �������һ��person���������Collections.sort(List l)��������,��ôl�е�Ԫ��person�����ǡ��ɱȽϵġ�
 *      ����Ҫʵ��comparable�ӿ�
 */
public class CollectionsTest01 {

	//private static final Collections Colletions = null;

	public static void main(String argv[]){
		//ʹ��Collections������ɼ�������
		List l = new ArrayList();
		
		//���Ԫ��
		l.add(10);
		l.add(9);
		l.add(20);
		l.add(5);
		l.add(30);
		
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		
		System.out.println();
		Collections Colletions = null;
		Colletions.sort(l);
		
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		System.out.println();
		
		//����set����
		Set s = new HashSet();
		
		s.add(1);
		s.add(10);
		s.add(9);
		s.add(8);
		
		//���ܶ�set����
		//Collections.sort(s);
		
		//��Setת����List
		List lists = new ArrayList(s);
		Collections.sort(lists);
		for(int i=0; i<lists.size(); i++){
			System.out.println(lists.get(i));
		}
		
		//��ArrayListת�����̰߳�ȫ�ġ�
		List myList= new ArrayList();
		Collections.synchronizedList(myList);
	}
}
