package Map;

import java.util.*;

/*
 * ����map�����г��õķ���
 * 	void clear(); ���Map
 * 	boolean containKey(Object key); �ж�Map���Ƿ����������key
 * 	boolean containValue(Object value);�ж�Map���Ƿ�������value
 * 	
 * 	Set<Map.Entry<k,v>> entrySet(); ���ش�ӳ���а�����ӳ���ϵ��Set��ͼ
 * 	
 * Object get(Object key); ͨ��key��ȡvalue
 * Object put(Object key,Object value);�򼯺�����Ӽ�ֵ��
 * 
 * boolean isEmpty(); �жϸü����Ƿ�Ϊ��
 * Object remove��Object key��; ͨ��key����ֵ��ɾ��
 * int size();��ȡMap�м�ֵ�Եĸ���
 * 
 * Set keySet(); ��ȡMap�����е�key
 * Collection value(); ��ȡMap���������е�value
 * 	
 * 
 * 
 * �洢��Map�����е�key���ֵ�Ԫ����Ҫͬʱ��дhashCode��equals����
 */
public class MapTest01 {

	public static void main(String argv[]){
		//����Map����
		Map persons = new HashMap();//��ʼ������16�� Ĭ�ϼ�������0.75
		
		//�洢��ֵ��
		persons.put("10000", "Jack");
		persons.put("10011", "Jack1");
		persons.put("10002", "Jack2");
		persons.put("10003", "Jack3");
		persons.put("10000", "Jack4");
		
		//�жϼ�ֵ�Եĸ���
		//Map�е�key�ǲ������ظ��ģ���hashSet��ͬ
		System.out.println(persons.size());
		
		
		//�жϼ������Ƿ����������key
		System.out.println(persons.containsKey("10000"));//true
		System.out.println(persons.containsValue("Jack"));//false  ��keyֵ�ظ�������valueֵ��������
		System.out.println(persons.containsValue("Jack4"));//true
		
		//ͨ��key��ȡvalue
		String k = "10011";
		Object v = persons.get(k);
		System.out.println(v);
		
		//ͨ��keyɾ����ֵ��
		persons.remove("10003");
		System.out.println(persons.size());
		
		//��ȡ���е�value
		Collection values = persons.values();
		Iterator it = values.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//��ȡ���е�key
		Set keys = persons.keySet();
		it = keys.iterator();
		while(it.hasNext()){
			
			k = (String) it.next();
			v = persons.get(k);
			System.out.println(k+"---->"+v);
		}
		
		//entrySet
		Set entryset = persons.entrySet();
		Iterator it3 = entryset.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next());
		}
	}
}
























