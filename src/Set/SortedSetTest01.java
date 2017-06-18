package Set;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



/*
 * java.util.SortedSet��һ���ӿڣ����ĸ��ӿ���java.util.Set;
 * java.util.TreeSet ��һ���࣬ʵ����java.util.SortedSet�ӿ�
 */
public class SortedSetTest01 {

	public static void main(String[] args) throws ParseException {
		//��������
		SortedSet ss = new TreeSet();
		
		//���Ԫ��
		ss.add(10);//�Զ�װ��
		ss.add(20);
		ss.add(15);
		ss.add(30);
		ss.add(25);
		ss.add(9);
		
		//����
		Iterator it = ss.iterator();
		while(it.hasNext()){
			System.out.println(it.next());//integer��д��toString����
		}
		
		//String
		SortedSet strs = new TreeSet();
		
		strs.add("JACK");
		strs.add("SUN");
		strs.add("KOOK");
		strs.add("LUCY");
		strs.add("KING");
		
		//����
		it = strs.iterator();
		while(it.hasNext()){
			Object element = it.next();
			System.out.println(element);
		}
		
		
		//Date
		String t1 = "2008-08-08";
		String t2 = "2009-08-08";
		String t3 = "2008-09-09";
		String t4 = "2012-08-08";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(t1);
		Date d2 = sdf.parse(t2);
		Date d3 = sdf.parse(t3);
		Date d4 = sdf.parse(t4);
		
		SortedSet time = new TreeSet();

		time.add(d1);
		time.add(d2);
		time.add(d3);
		time.add(d4);
		
		
		it = time.iterator();
		while(it.hasNext()){
			Object element = it.next();
			System.out.println(element);
		}
		
		
		
		
	}

}
