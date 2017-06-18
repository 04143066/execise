package Set;

import java.util.*;

/*
 * ������Set�����д洢��Ԫ�أ���Ԫ�ص�hashCode��equals����
 * 
 * HashMap����һ��put������put��key��value��key�����򲻿��ظ�
 * 
 * ע�� �洢��HashSet��HashMap�е�Ԫ�أ� Employee��дhashCode,euqals����
 */
public class SetTest02 {

	public static void main(String[] args) {
		//��������
		Set es = new HashSet();
		
		Employee e1 = new Employee("1000","Jack");
		Employee e2 = new Employee("1000","Jack");
		Employee e3 = new Employee("1000","Jack2");
		Employee e4 = new Employee("2001","Jack3");
		Employee e5 = new Employee("3000","Jack4");
		Employee e6 = new Employee("3001","Jack5");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		//���Ԫ��
		es.add(e1);
		es.add(e2);//�����쳣
		es.add(e3);
		es.add(e4);
		es.add(e5);
		es.add(e6);
		
		System.out.println(es.size());
	}

}


//������ʵ��ҵ���߼���֪���ù�˾Ա�������1000 - 9999
class Employee{
	//���
	String no;
	//����
	String name;
	
	Employee(String no, String name){
		this.no = no;
		this.name = name;
	}
	
	//��дequals���������Ա���ı�ź�������ͬ����ͬһ������
	public boolean equals(Object o){
		if(this ==o){
			return true;
		}
		if(this instanceof Employee){
			Employee e = (Employee)o;
			if(e.name == this.name && e.no == this.no){
				return true;
			}
		}
		return false;
	}
	
	//��дhashCode����  ע��ɢ�зֲ�����
	public int hashCode(){
		//��Ա����ŷ���
		return no.hashCode();//��String����ת����int��,���Ա�����һ���ͽ���equals
	}
	
}