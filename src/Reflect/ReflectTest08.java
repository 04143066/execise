package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
 * ��ȡ���췽��
 */
public class ReflectTest08 {

	public static void main(String[] args) throws Exception{
		
		//1.��ȡ��
		Class c = Class.forName("java.lang.String");
		
		//2.��ȡ���й��췽��
		Constructor[] cs = c.getDeclaredConstructors();
		
		for(Constructor con:cs){
			//��ȡ���η�
			System.out.print(Modifier.toString(con.getModifiers())+" ");
			//��ȡ���췽����
			System.out.print(c.getName()+" ");
			//���췽������ʽ�����б�
			Class[] parameterTypes = con.getParameterTypes();
			for(Class parametertype:parameterTypes){
				System.out.print(parametertype.getSimpleName()+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//������
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		//���췽��
		for(Constructor con:cs){
			sb.append("\t");
			sb.append(Modifier.toString(c.getModifiers())+" ");
			sb.append(c.getSimpleName()+"(");
			//�β�
			Class[] parameterTypes = con.getParameterTypes();
			for(int i=0; i<parameterTypes.length; i++){
				Class parametertype = parameterTypes[i];
				if(i==parameterTypes.length-1)
					sb.append(parametertype.getSimpleName());
				else
					sb.append(parametertype.getSimpleName()+", ");
			}
			sb.append(")  { }\n");
		}
		sb.append("}");
		System.out.println(sb);
	}
}
