package Date;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡϵͳ��ǰʱ��
 */
public class DateTest02 {

	public static void main(String argv[]){
		//��ȡϵͳ��ǰʱ��
		Date nowTime = new Date();
		System.out.println(nowTime);//  Sun May 08 22:29:02 CST 2016
		
		//���ϳ���˵��java.util.Date; �Ѿ���д��Object�е�toString����
		
		//java.util.Data; --> String ��ʽ������
		
		/*
		 * ���ڸ�ʽ��y�� M�� d�� HСʱ m�� s�� S����
		 */
		
		//1.�������ڸ�ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss SSS");
		
		//2.��ʼ��ʽ��
		String strTime = sdf.format(nowTime);
		System.out.println(strTime);
	}
}
