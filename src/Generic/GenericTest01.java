package Generic;

import java.util.*;

/*
 * ����JDK5.0�������Է���(���Զ�װ��һ�����Ǳ����ڸ���)
 * 		1.Ϊʲô���뷺��
 * 			������÷��ͣ������п��Դ洢�����������ͣ�����������ǿ������ת��
 * 		2.���͵��﷨ʵ��
 * 		3.���͵���ȱ��
 * 			�洢������̫ͳһ
 */
public class GenericTest01 {

	public static void main(String argv[]){
		//����һ��List���ϣ�ֻ�ܴ洢�ַ�������
		List<String> strs = new ArrayList<String>();
		
		//���Ԫ��
		strs.add("lk");
		strs.add("zxx");
		
		//����
		Iterator<String> it = strs.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
}
