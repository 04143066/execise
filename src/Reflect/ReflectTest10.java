package Reflect;
/*
 * �������ȡ����͸���ӿ�
 */
public class ReflectTest10 {

	//ͨ�������ȡString��ĸ��ӿں͸��ӿ�
	public static void main(String[] args) throws Exception {
		//Class c = Class.forName("java.lang.String");
		Class c = Class.forName("java.util.Date");
		//��ȡ����
		Class superClass = c.getSuperclass();
		
		System.out.println("����:"+superClass.getName());;
		
		//��ȡ���ӿ�
		Class[] ins = c.getInterfaces();
		
		for(Class in:ins){
			System.out.println("���ӿ�:"+in.getName());
		}
	}
}
