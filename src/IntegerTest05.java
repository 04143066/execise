/*
 * jdk5.0�����ԣ�
 *   һ�µ������ʺ�jdk1.5�汾֮��ġ�����1.5
 *   jdk1.4�� ����1.4����֮ǰ�����а汾��������������
 *   
 *   �Զ�װ�䣨auto_boxing�����Զ����䣨auto_unboxing��
 */
public class IntegerTest05 {

	public static void main(String argv[]){
		//jdk5.0֮ǰ
		
		// int --> Integer(װ��)
		Integer i1 = new Integer(10);
		//Integer --> int (���䣩
		int i2 = i1.intValue();
		//JDK5.0֮�󣬰���5.0
		Integer i3= 10;//�Զ�װ��
		int i4 = i3;//�Զ�����
		
		System.out.println(i3);
		System.out.println(i4+1);
		
		m1(123);//�Զ�װ��
		System.out.println(m2(10,5)+1);//�Զ�װ��
	}
	
	public static void m1(Object o){
		System.out.println(o);
	}
	
	public static int m2(Integer i1, Integer i2){
		return i1-i2;//�Զ�����
	}
}
