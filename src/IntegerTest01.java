/*
 * java�а��ֻ����������Ͷ�Ӧ�İ�װ���ͣ�
 * 	������������                            ��װ����
 *  byte             java.lang.Byte;
 *  short            java.lang.Short;
 *  int              java.lang.Integer;
 *  long             java.lang.Long;
 *  
 *  float            java.lang.Float;
 *  double           java.lang.Double;
 *  
 *  boolean          java.lang.Boolean;   
 *  
 *  char             java.lang.Character;
 *  
 *  ˼����java���ṩ�İ��ֻ����������Ͳ�������Ϊʲôjava�л�Ҫ�ṩ��Ӧ�İ�װ���أ�
 *  	���㣬Object���������ͣ�����Object����ʱ��������byte��short�ȣ�����Ҫ������
 *      �İ�װ���͡�
 */
public class IntegerTest01 {

	//���󣺹涨m1�������Խ���java�е��κ�һ����������
	public static void m1(Object o){
		System.out.println(o);
	}
	
	//���
	public static void main(String argv[]){
		//������������
		byte b = 10;
		
		//��������
		Byte  b1 = new Byte(b);
		m1(b1);    //10  Byte�Ѿ���Object��toString ������д��
	}
}
