/*
 * �����Զ�������Զ�װ�䣺
 * 	1.�Զ�װ����Զ������ǳ������׶ε�һ������
 *    �ͳ���������޹�
 *  2.�Զ�������Զ�װ����Ҫ�Ƿ������Ա����
 *  
 */
public class IntegerTest06 {

	public static void main(String argv[]){
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		//���ﲻ���в��䣬���ú����ñȽϲ����в���
		System.out.println(i1==i2);//false  ���ε��ڴ��ַ��һ����������false
		
		//�Ƚ�����Integer���͵������Ƿ���ȣ������á�==��
		System.out.println(i1.equals(i2));//true Integer �Ѿ���д��object�е�equals����
		
		//�ص㣺
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);//false
		
		
		//ע��һ�³���,���������[-128,127]��java������һ�������ͳ����ء�,�ڷ�������
		//�����ͳ�����ֻ�洢-128~127֮�������
		
		Integer i5 = 127;//��������Ǵӷ������еġ����ͳ����ء�
		Integer i6 = 127;
		System.out.println(i5 == i6);//true
		
		Integer i7 = -128;
		Integer i8 = -128;
		System.out.println(i7 == i8);//true
		
		
		
		
		
	}
}
