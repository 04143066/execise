/*
 * �ַ������õķ���
 */
public class StringTest06 {
	
	public static void main(String argv[]){
		//1.char charAt��int index��
		String s1 = "�������£��ǻ��ˣ�";
		char c1 = s1.charAt(2);
		System.out.println(c1);
		
		//2.boolean endsWidth(String endStr)
		System.out.println("HelloWorld.java".endsWith("java"));
		System.out.println("HelloWorld.java".endsWith(".java"));
		System.out.println("HelloWorld.java".endsWith("HelloWorld.java"));
		System.out.println("HelloWorld.java".endsWith("txt"));
		System.out.println("HelloWorld.java".endsWith("java "));
		
		//3.boolean equalsIgnoreCase(String anotherString)
		System.out.println("abc".equalsIgnoreCase("Abc"));
		
		//4. byte[] getBytes()
		byte[] bytes = "abc".getBytes();
		for(int i=0; i<bytes.length; i++){
			System.out.println(bytes[i]);
			
		//5.int indexOf(String str)
			System.out.println("http://192.168.1.100:8080/oa/login".indexOf("/oa"));
			
		//6.int indexOf(String str, int fromIndex);
			System.out.println("javaoraclec++javavb".indexOf("java",1));
			
		//7.int indexOf(String str, int lastIndex);
			System.out.println("javaoraclec++javavb".lastIndexOf("java"));
			
		//8.int lastIndexOf(String str, int fromIndex)
			System.out.println("javaoraclec++javavb".lastIndexOf("java",1));
			
		//9.int length();
			System.out.println("abc".length());//��������length���ԣ�String��length()����
			
		//10.String replaceAll(String s1,String s2)
			System.out.println("javaoraclec++javavb".replaceAll("java", "mysql"));//����������ĸ��ַ���
			
	    //11.String[] split(String s);
			String myTime = "2008,08,08";
			String[] ymd = myTime.split(",");
			for(int j=0; j<ymd.length; j++){
				System.out.println(ymd[j]);
			}
			
		//12.boolean startswith(String s);
			System.out.println("/system/login.action".startsWith("/"));
			
		//13.String substring(int begin);
			System.out.println("oa/login.action".substring(3));//login.action  ��ȡ
			
		//14.String substring(int begin,int end);
			System.out.println("/oa/login.action".substring(4, 9));//ǰ����������治����
			
		//15.char[] toCharArray()
			char[] c2 = "�������".toCharArray();
			for(int j=0; j<c2.length; j++)
				System.out.println(c2[j]);
			
		//16.ת���ɴ�д
			System.out.println("Abcdef".toUpperCase());
		
		//17.ת����Сд
			System.out.println("ABCDE".toLowerCase());
			
		//18.String trim()
			System.out.print("           a bdc e       ".trim());//ǰ��Ŀո�û����
			System.out.println("Test");
			
		//19.String valueof(Object obj);
			Object o1 = new Object();
			System.out.println(o1);
			System.out.println(String.valueOf(o1));
			System.out.println(o1.toString());
			
			Object o = null;
			System.out.println(o);
			System.out.println(String.valueOf(o));
			System.out.println(o.toString());
			
			
		}
	}
}
