package Set;

import java.util.*;

/*
 * set����:
 * 	1.HashSet�ײ�ʵ������һ��HashMap��HashMap�ĵײ������hash������ݽṹ������͵�������Ľ�ϡ�
 *  2.��ϣ���ֽ�ɢ�б���ϣ��ײ���һ�����飬���������ÿһ��Ԫ����һ����������
 *  ÿ������������һ����һ�޶���hashֵ������������±ꡣ��ĳ�����������е�ÿһ���ڵ�
 *  �ϵ�hashֵ����ȵġ�hashֵʵ������key����Hashcode��������ͨ����hash function��
 *  ת���ɵ�ֵ��
 *  3.�ڹ�ϣ�������Ԫ�أ��������equals�����������Ԫ�ص�key����ɢ�б��е�ĳ��Ԫ�ص�key��������
 *  
 *  
 *  4.���򣬲��ظ���hashMap�е�key����hashset������
 *  
 *  5.HashSet �� HashMap��ʼ����������16��Ĭ�ϼ������Ӷ���0.75
 */
public class SetTest01 {

	public static void main(String argv[]){
		Set s = new HashSet();//�ײ�������ʼ�������� 16   ��Ĭ�ϼ���������0.75,��100�����飬����75�����ݣ�
		
		//���򲻿��ظ�
		s.add(1);
		s.add(1);  //û���쳣�����Ӳ���ȥ 
		s.add(100);
		s.add(85);
		s.add(88);
		
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}
