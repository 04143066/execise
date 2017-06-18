package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * java.lang.reflect.Field; ���е�����
 * 
 */
public class ReflectTest04 {

	public static void main(String[] args) throws ClassNotFoundException {
		//��ȡ������
		//Class c = Class.forName("Reflect.User");
		// Class c = Class.forName("java.lang.String");
		Class c = Class.forName("Main");
		//��ȡ���е�public���ε�����
		Field[] fs = c.getFields();
		System.out.println(fs.length);
		
		//��ȡ��������
		Field[] fs1= c.getDeclaredFields();
		for(Field field:fs1){
			int i = field.getModifiers();
			System.out.print(i+"-->");
			String str2 = Modifier.toString(i);
			System.out.println(str2);
			Class type = field.getType();
			System.out.print(type.getName()+", ");
			System.out.print(type.getSimpleName()+";    ");
			System.out.println(field.getName());
		}
		System.out.println();
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		for(Field field:fs1){
			sb.append("\t");
			sb.append(Modifier.toString(field.getModifiers())+" ");
			sb.append(field.getType().getSimpleName()+" ");
			sb.append(field.getName()+";\n");
		}
		
		sb.append("}");
		System.out.println(sb);
	}
}







