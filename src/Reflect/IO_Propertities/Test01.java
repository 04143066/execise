package Reflect.IO_Propertities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * IO+Propertities
 * 
 * dbinfo�������ļ����ǳ��������ļ�
 * �����ļ��������ǣ��ǳ��������һ���ڳ����пɱ�ö�����Ҫд��
 * ����ͬ���ĳ���õ���һ���Ľ�� �������ļ������key���ܸģ����key�ظ���value����
 * 
 * ��dbinfo�����������ļ��ֽ����������ļ���java�й淶�����ļ���.propertities��β
 * key��value֮������ǡ�=�� ������ �� ������Щ����˭�ȳ��֣�����˭Ϊ��׼����key��value
 * 
 * �������н�������     native2ascii   
 * ������     ������  
 * ���ӡһ���ַ������������ļ��У���java����̨��ӡ�����Ͳ���������
 * 
 */
public class Test01 {

	public static void main(String[] args) throws FileNotFoundException{
		//1.�������Զ���
		Properties p = new Properties();
		
		//2.����������
		FileInputStream fis = new FileInputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\Reflect\\IO_Propertities\\dbinfo");
		
		//3.��fis���е��������ݼ��ص����Զ�����
		try {
			p.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String v1 = p.getProperty("driver");
		String v2 = p.getProperty("password");
		String v3 = p.getProperty("username");
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}
}