package Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest06 {
	
	public static void main(String[] args) throws Exception {
		//获取类
		Class c = Class.forName("Reflect.CustomerService");
		
		//获取所有方法
		Method[] ms = c.getDeclaredMethods();
		
		for(Method m:ms){
			//方法的返回值类型
			Class returnType = m.getReturnType();
			System.out.print(returnType.getName()+" ");
			//方法名
			System.out.print(m.getName()+" ");
			//方法的形式参数列表
			Class[] parameterTypes = m.getParameterTypes();
			for(Class parameterType:parameterTypes){
				System.out.print(parameterType.getSimpleName()+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//反编译
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class ");
		sb.append(c.getSimpleName()+"{\n");
		
		for(Method m:ms){
			sb.append("\t");
			sb.append(Modifier.toString(m.getModifiers()));
			sb.append(m.getReturnType().getSimpleName());
			sb.append(m.getName());
			sb.append("(");
			
			//形参
			Class[] parameterTypes = m.getParameterTypes();
			for(int i=0; i<parameterTypes.length;i++){
				Class parameterType = parameterTypes[i];
				if(i==parameterTypes.length-1)
					sb.append(parameterType.getSimpleName());
				else
					sb.append(parameterType.getSimpleName()+",");
			}
			sb.append("){ }\n");
		}
		sb.append("}");
		System.out.println(sb);
	}
}
