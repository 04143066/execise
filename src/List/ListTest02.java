package List;

import java.util.*;

/*
 * ����List����
 * ��ΪArrayList�ײ������飬���������±��
 * 
 * ArrayList����Ĭ�ϳ�ʼ��������10������֮����ԭ������1.5��
 * 
 * Vector����Ĭ�ϳ�ʼ��������10����������ԭ������2��
 * 
 * ����Ż�ArrayList��vector��
 *   �����������ݲ�������Ϊ������Ҫ���鿽�������鿽���ܺ��ڴ棬���һ�θ�׼��
 */
public class ListTest02 {

	public static void main(String argv[]){
		
		//����list����
		List l = new ArrayList();//Ĭ�ϳ�����10,�ĳ�LinkedList������������ִ��
		
		//���Ԫ�ء�
		l.add(123);
		l.add(321);
		l.add(69);
		
		l.add(1,555);
		
		//ȡ�õ�һԪ��
		System.out.println(l.get(0));
		System.out.println();
		
		//������List�������еı�����ʽ��
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		System.out.println();
		
		//�õ�����
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
