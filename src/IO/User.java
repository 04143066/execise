package IO;

import java.io.Serializable;//�ýӿ���һ�������л��ģ�   �ýӿ�û���κη�������һ����־�Խӿ� ��
                            //�������Ľӿڻ��У�java.lang.Cloneable;
/*
 * ��־�Խӿڵ����ã��𵽱�־������
 * JVM�����������ʵ���˱�ʶ�Խӿڣ����������
 * 
 * ����:User ʵ�� Serializable �ӿڣ�JVM������������������л��洢Userʱ���������һ���汾���к� serialVersionUID��
 * ���ǵ�������user����¸ı�֮���ٴη����л�ʱ�ͻ�汾���к�ƥ�䷢���쳣�������ڽ�User��ʱ�����Լ�дһ���汾��
 * ����ϵͳ�Ͳ����Զ����䵼���쳣��
 */
public class User implements Serializable{

	String name;
	int age;
	//private static final long serialVersionUID = 7938342973138034619L;
	User(String name){
		this.name = name;
	}
	
	public String  toString(){
		return name;
	}
}
