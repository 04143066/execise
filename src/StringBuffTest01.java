/*
 * java.lang.StringBuffer;
 * java.lang.StringBuilder;
 * 
 * 	1.StringBuffer��ʲô��
 *   ��һ���ַ���������
 *   
 *  2.����ԭ��
 *   Ԥ�����ڴ�������һ��ռ䣬�������ַ����У�
 *   ���Ԥ���Ŀռ䲻���ã�������Զ����ݣ���
 *   ���ɸ����ַ������С�
 *  
 *  3.StringBuffer ,StringBuilder ��String���������
 *   String �ǲ��ɱ���ַ����У��洢���ַ�����������
 *   StringBuffer �ײ���һ��char���飬���Ǹ�char����ʱ�ɱ�á�
 *   �������Զ����ݡ�
 *   
 *  4.StringBuffer ��StringBuilder��Ĭ�ϳ�ʼ��������16
 *  
 *  5.����Ż�StringBuffer �� StringBuilder �أ�
 *  	����ڴ���StringBuffer֮ǰԤ��StringBuffer�Ĵ洢�ַ�����
 *  	Ȼ���ڴ���StringBuffer��ʱ�����ָ����ʼ�������ķ�ʽ����StringBuffer��
 *      Ϊ�˼��ٵײ�����鿽�������Ч��
 *      
 *  6.StringBuffer �� StringBuilder������
 *  	StringBuffer���̰߳�ȫ�ġ��������ڶ��̵߳Ļ�����ʹ�ò���������⡣��
 *  	StringBuilder�Ƿ��̰߳�ȫ�ġ����ڶ��̻߳�����ʹ�ÿ��ܳ������⣩
 */
public class StringBuffTest01 {
	
	public static void main(String argv[]){
		//�����ַ�������������
		StringBuffer sb = new StringBuffer();
		//������StringBuffer��׷���ַ���,���ʹ��String�ᴴ�������Ķ���
		String[] ins ={"����","����","��ʳ","˯��"};
		
		for(int i=0; i<ins.length; i++){
			if(i == ins.length-1)
				sb.append(ins[i]);
			else{
				sb.append(ins[i]);
				sb.append(",");
			}			
		}
		System.out.println(sb);
	}
}

