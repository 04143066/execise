/*
 * ��java.lang.Iteger;����Ϊ���������������
 */
public class IntegerTest02 {

	public static void main(String argv[]){
		//��ȡint���͵����ֵ����Сֵ
		System.out.println("int��Сֵ��"+Integer.MIN_VALUE);
		System.out.println("int���ֵ:"+Integer.MAX_VALUE);
		
		//��int��byte
		System.out.println("byte��Сֵ:"+Byte.MIN_VALUE);
		System.out.println("byte���ֵ:"+Byte.MAX_VALUE);
		
		//����Integer���͵Ķ���
		Integer i1 = new Integer(10);//int --> Integer
		Integer i2 = new Integer("123");//String --> Integer
		
		System.out.println(i1);
		System.out.println(i2);
		
		Integer i3 = new Integer("abc");//��ͨ�����룬�����лᱨ�쳣���������ַ�������
	}
}
